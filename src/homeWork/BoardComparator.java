package homeWork;

import java.util.Comparator;

public class BoardComparator implements Comparator<BoardVo> {

//char flag = 'n'; 
//	
//	public BoardComparator(char flag) {
//		this.flag = flag;
//	}
//	
//	@Override
//	public int compare(BoardVo s1, BoardVo s2) {
//		int result = 0;
//		if(flag == 'n') {
//			result = s1.getmDate().compareTo(s2.getmDate());
//		}else {
//			result = s1.getmDate().compareTo(s2.getmDate());
//		}
//		return result;
//		
//	}
	@Override
	public int comparae(BoardVo o1, BoardVo o2) {
		int r=0;
		if(o1 == null || o2 == null) {
			r = 0;
		} else {
			r = o2.getmDate().compareTo(o1.getmDate());
		}
		return r;
	}
	
}
