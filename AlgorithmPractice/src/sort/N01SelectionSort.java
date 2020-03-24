package sort;

/**
 * 선택정렬 연습
 * @author dohyun
 * 선택 정렬은 배열에서 가장 낮은 값을 찾아서 가장 앞에 위치시키는 정렬이다.
 * 데이터의 갯수가 N개일 때 선택 정렬은 N*(N+1)/2 번 가량의 연산을 수행
 * 선택정렬의 시간 복잡도는 (N^2)
 */
public class N01SelectionSort {

	public static void main(String[] args) {
		
		int min		= 0;	// 각 순회의 가장 낮은 값을 세팅
		int max		= 0;	// 배열내의 숫자 중 최대값
		int index	= 0;	// 배열 순번 (Zero-based numbering)
		int temp	= 0;	// 비교 시 임시저장 값 
		
		int leng	= 10;	//배열의 길이
		
		//길이에 맞는 배열 생성
		int array[] = new int[leng];		
		
		//중복 되지 않는 숫자의 배열 생성
        for (int i = 0; i < array.length; i++ )
        {
        	array[i] = (int)(Math.random() * 100 + 1);
            for ( int j = 0; j < i; j++ )
            {//기존 배열 내의 값과 비교
                if( array[i] == array[j] )
                {//기존 배열내의 값과 같은 경우 i번째 배열에 대해 다시 연산
                    i--;
                }
            }
            
            if (max < array[i]) 
            {//최대값을 세팅함
            	max = array[i];
			}
        }
        
		//최초 생성된 배열 출력
		System.out.print("최초 생성된 배열 : {");
		for (int i = 0; i < array.length; i++)
		{
			if (i == 0) 
			{
				System.out.printf("%d", array[i]);
			}
			else
			{
				System.out.printf(", %d", array[i]);
			}
			
		}
		
		System.out.print("} 최대값 : " + max + " \n");
		
		//선택 정렬 처리
		for (int i = 0; i < array.length; i++)
		{
			min = max;	//min값을 가장 큰 값으로 초기화
			
			for (int j = i; j < array.length; j++)
			{//순회하면서 커지는 i값부터 배열의 끝까지 순회
				if (min > array[j])
				{//만약 배열의 j번째 값이 현재 순회 중 인 가장 작은 값이라면 
					min = array[j]; //min에 가장 작은 값을 세팅
					index = j;		//현재 순회 중 가장 작은 값은 j번째에서 발견, 인덱스 값으로 설정함
				}
			}
			temp = array[i];		//array[i]에 있던 값을 temp에 담아 놓는다.
			array[i] = array[index];//이번 순회에서 찾아낸 최소값을 array[i]에 세팅 
			array[index] = temp;	//원래 array[i]에 있던 값은 최소값이 있던 위치에 세팅 
		}
		
		//선택 정렬된 배열 출력
		System.out.print("선택 정렬된 배열 : {");
		
		for (int i = 0; i < array.length; i++)
		{
			if (i == 0) 
			{
				System.out.printf("%d", array[i]);
			}
			else
			{
				System.out.printf(", %d", array[i]);
			}
			
		}
		
		System.out.print("}");

	}

}
