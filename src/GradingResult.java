import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GradingResult {
	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> roundedGrades = new ArrayList<Integer>();
		grades.forEach(grade -> {
			if(grade< 38 || grade%5 < 3) roundedGrades.add(grade);
			else if (grade%5 > 2) roundedGrades.add(grade+(5-grade%5));
		});
		roundedGrades.forEach(g -> System.out.println(g));
		return roundedGrades;
	    

	    }
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = gradingStudents(grades);


        bufferedReader.close();
    }
	

}
