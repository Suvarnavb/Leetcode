class Solution {
    public double average(int[] salary) {

        Arrays.sort(salary);

        int sum = 0;
        double avg;

        if(salary.length % 2 == 0) {

            for(int i = 1; i < salary.length - 1; i++) {
                sum = sum + salary[i];
            }

            avg = (double)sum / (salary.length - 2);

        } else {

            for(int i = 1; i < salary.length - 1; i++) {
                sum = sum + salary[i];
            }

            avg = (double)sum / (salary.length - 2);
        }

        return avg;
    }
}