package level3.solution70_바탕화면정리;

public class Solution70 {
	// 이중 for문을 돌린다.
	// 시작 지점과 끝 지점을 찾는 방식이 다르다.
	// 시작 지점은 최소값을 가져가고 끝 지점은 최대값을 가져간다.
	// 가장 바깥쪽에 위치한 파일의 위치를 확인해 본다.
	public int[] solution(String[] wallpaper) {
		int[] answer = new int[4];
		int lux = 50;
		int luy = 50;
		int rdx = 0;
		int rdy = 0;
		for (int i = 0; i < wallpaper.length; i++) {
			String[] row = wallpaper[i].split("");
			for (int j = 0; j < row.length; j++) {
				if (row[j].equals("#")) {
					lux = Math.min(lux, i);
					luy = Math.min(luy, j);
					rdx = Math.max(rdx, i + 1);
					rdy = Math.max(rdy, j + 1);
				}
			}
		}
		answer[0] = lux;
		answer[1] = luy;
		answer[2] = rdx;
		answer[3] = rdy;
		return answer;
	}
}
