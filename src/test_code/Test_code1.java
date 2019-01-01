package test_code;


import java.util.Scanner;

public class Test_code1 
{
    
	
	
	public static void main(String[] args) 
   {
	   
	   String id;
	   
	   String pw;
	   
	   String[] byun= {"검도","격투기","달리기","헬쓰","그외운동"};
	   
	   String[] byun1={"코딩","개발자","자바","순수자바"};
	   
	   String[] byun2= {"맥북","QHD모니터","4k모니터","앱등이"};
	   
	   Scanner sc=new Scanner(System.in);

	   System.out.println("아이디와 비번을 입력하세요!");
	   id=sc.nextLine();
	   pw=sc.nextLine();
	   
	   if(id.equals("byun") && pw.equals("jongbae"))
	   {
		   System.out.println("승인");
		   System.out.println("1~3을 선택하시오");
		   Scanner scc=new Scanner(System.in);
		   
		   int choice_0=1; int choice_1=2; int choice_2=3;
		 
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
