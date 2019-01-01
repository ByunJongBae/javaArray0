package test_code;


import java.util.Scanner;

public class Test_code1 
{
    
	/*
	 * 의도 ==>> 콘솔에서 1~3의 정수를 입력하면 배열에 선언밑 초기화가 된 "저장된" 값이콘솔에 출력한다 ! 
	 * 
	 * 
	 */
	
	public static void main(String[] args) 
   {
	   
	   String id;
	   
	   String pw;
	   
	   String[] byun= {"검도","격투기","달리기","헬쓰","그외운동"}; // byun ,1~2 는 string 을 이용한 배열값저장 
	   
	   String[] byun1={"코딩","개발자","자바","순수자바"};
	   
	   String[] byun2= {"맥북","QHD모니터","4k모니터","앱등이"};
	   
	   Scanner sc=new Scanner(System.in); //scanner 선언 콘솔에 입력하기위한 ! 

	   System.out.println("아이디와 비번을 입력하세요!");
	   id=sc.nextLine(); // id와 pw 를 입력 할수있는 ! 
	   pw=sc.nextLine();
	   
	   if(id.equals("byun") && pw.equals("jongbae"))
	   {
		   System.out.println("승인");
		   System.out.println("1~3을 선택하시오"); // 1~3을 선택메세지(콘솔) 
		   Scanner scc=new Scanner(System.in);
		   
		   int choice_0=1; int choice_1=2; int choice_2=3; 
		   //int 형으로 1~3 선언가능하게함 ,scc 는 scanner 변수 이건 if문안에서만 사용하는 지역변수처럼 ㅋ
		  // if 문 안에서 1~3을 콘솔에 입력한후 ====>> 배열에 저장된값이 나온다 
		   
		   choice_0=scc.nextInt();
		   if(choice_0==1)
			  {
				  for (String byun_str : byun)
				  {
					System.out.println(byun_str);
				  }
				 
				  choice_1=scc.nextInt();
				  if(choice_1==2)
				  {
					  for (String byun_str : byun1)
					  {
						System.out.println(byun_str);
					  }
					  
				  }
				  
				  choice_2=scc.nextInt();
				  if(choice_2==3)
				  {
					  for (String byun_str : byun2)
					  {
						System.out.println(byun_str);
					  }
				  }
			  }
	   }
	   else
	   {
		   System.out.println("응 아냐 다시해~~!");
	   }
   }
}
