class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return answer;
        
    }

    public void dfs(int[] numbers, int target, int depth, int sum){
        
        // 끝까지 다 계산했을 때
        if(depth == numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }
        
        // 더하기
        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        
        // 빼기
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }
    
}

