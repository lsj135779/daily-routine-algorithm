package level3.solution71_개인정보수집유효기간;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution71 {
	// privacies배열에 있는 것들을 terms에 있는 것에 따라 유효기간을 알아낸다.
	// 오늘일자와 비교해서 지난 것들을 answer에 추가한다.
	public Integer[] solution(String today, String[] terms, String[] privacies) {
		Integer[] answer = {};
		List<Integer> result = new ArrayList<>(); // 몇개가 나올지 모르기 때문에 리스트로 일단 저장
		Map<String, Integer> termsMap = new HashMap<>();
		// temrs배열을 map로 바꾸기
		for (int i = 0; i < terms.length; i++) {
			String[] term = terms[i].split(" ");
			termsMap.put(term[0], Integer.parseInt(term[1]));
		}
		// privacies배열에 약관에 따라 년,월,일 가져와서 유효기간 더하기
		for (int i = 0; i < privacies.length; i++) {
			String[] privacy = privacies[i].split(" ");
			Integer expiryDate = termsMap.get(privacy[1]);
			Integer year = Integer.parseInt(privacy[0].split("\\.")[0]);
			Integer month = Integer.parseInt(privacy[0].split("\\.")[1]);
			Integer date = Integer.parseInt(privacy[0].split("\\.")[2]);

			if (date - 1 == 0) {
				date = 28;
				if (month - 1 == 0) {
					month = 12;
					year--;
				} else {
					month--;
				}
			} else {
				date--;
			}

			if (month + expiryDate > 12) {
				year += (month + expiryDate) / 12;
				month = (month + expiryDate) % 12;
				if (month == 0) {
					month = 12;
					year--;
				}
			} else {
				month += expiryDate;
			}

			// 오늘이랑 비교하기
			if (Integer.parseInt(today.split("\\.")[0]) > year) {
				result.add(i+1);
				continue;
			} else if (Integer.parseInt(today.split("\\.")[0]) == year) {
				if (Integer.parseInt(today.split("\\.")[1]) > month) {
					result.add(i+1);
					continue;
				} else if (Integer.parseInt(today.split("\\.")[1]) == month) {
					if (Integer.parseInt(today.split("\\.")[2]) > date) {
						result.add(i+1);
						continue;
					}
				}
			}

			// 위와 조건 다른 방식
//			month += expiryDate;
//			date -= 1;
//			if (date == 0) {
//				month -= 1;
//				date = 28;
//			}
//			if (month > 12) {
//				year += (month / 12);
//				month = month - 12 * (month / 12);
//			}
//			if (month == 0) {
//				year -= 1;
//				month = 12;
//			}
//
//			if (year*10000 + month*100 + date < Integer.parseInt(today.replace(".",""))) {
//				result.add(i+1);
//			}
		}
		answer = result.toArray(new Integer[result.size()]);
		return answer;
	}
}
