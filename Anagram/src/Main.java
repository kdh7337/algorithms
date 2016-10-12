
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap, TreeMap
		System.out.println("Expected result: true ; " +Anagram.telling("aaabbaaccaa", "abbccaaaaaa"));
		System.out.println("Expected result: false ; " +Anagram.telling("aaaaaaaaaaaaaaaaaaa","bbbbbbbbbbaaaaaaaaaaaaa"));
		
		//Arrays
		System.out.println("Expected result: true ; " +Anagram.compare("1233544433125632","1233544433125632"));
		System.out.println("Expected result: false ; " +Anagram.compare("1233544433125632","123ewsdfcvw4rsfdx1"));
		
		//한글검증
		//HashMap, TreeMap
		System.out.println("Expected result: true ; " +Anagram.telling("ㄴㄹ요ㅗㅁㅇ뉴ㅜㅠㄹㅈ머ㅘ륜머ㅗㅇ류ㅏㅁ졷ㅎ라노율너올휸어ㅗㅀ만", "ㄴㄹ요ㅗㅁㅇ뉴ㅜㅠㄹㅈ머ㅘ륜머ㅗㅇ류ㅏㅁ졷ㅎ라노율너올휸어ㅗㅀ만"));
		System.out.println("Expected result: false ; " +Anagram.telling("ㅂㅈㄱㄷ쇼ㅓㅗㅓㅏㅗㅎㄹㄹㅇㄴㅁ","ㅡㅜㅗㄷㅈㄴㅇㄹ,.ㅡㅈ더ㅏㅣㄹ아ㅣㅓㅠㅔ;ㅣㅂ;ㄷㅁ"));
		
		//Arrays
		System.out.println("Expected result: true ; " +Anagram.compare("ㅈㅂㄷㄱ회ㅕㅎㄹㅇㅎ호ㅓㅏㅣㅓ,ㅡㅜㅠㅍㄴㅁ코ㅓㅀ로ㅗㅓ453ㄷㄱㅇㄹ호ㅓㅛㅕㅈㄷㄹㅇㄴㅍ튜","ㅈㅂㄷㄱ회ㅕㅎㄹㅇㅎ호ㅓㅏㅣㅓ,ㅡㅜㅠㅍㄴㅁ코ㅓㅀ로ㅗㅓ453ㄷㄱㅇㄹ호ㅓㅛㅕㅈㄷㄹㅇㄴㅍ튜"));
		System.out.println("Expected result: false ; " +Anagram.compare("21ㄷㅈㅇㄴㄹㅊㅌ3ㅅㅇㅀㅍㅊ6ㅛㅅ호ㅜ퓨 87ㅕㅑㅐ9ㅓㅏㅗㅜ","ㅌㅋㅊㄴㄷㅈㅅㄷㅇ허ㅗㅕㄴ 153276ㄱ4샤ㅘㅡㅜㅎ349ㄷ게ㅐㅇ리230-뱌[갣리;ㄴㅇㅍ8943쇽ㅈ대ㅑㅓ려ㅓ"));
		
	}

}
