class Solution {
    public int solution(String[] order) {
        int americanoCnt = 0;
        int cafelatteCnt = 0;
        for (String menu : order) {
            if(menu.contains("americano")) {
                americanoCnt++;
            } else if(menu.contains("cafelatte")) {
                cafelatteCnt++;
            } else {
                americanoCnt++;
            }
        }
        return (4500 * americanoCnt) + (5000 * cafelatteCnt);
    }
}