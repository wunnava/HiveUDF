import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;


@Description(
		name = "UpAway",
		value = "_FUNC_(str) - Converts a string to uppercase",
		extended = "Example:\n" +
		"  > SELECT pper(author_name) FROM authors a;\n" +
		"  STEPHEN KING"
		)
public class UpAway extends UDF {

 public Text evaluate(Text str)
 {
	Text result =  new Text("");
	 if(str!=null)
	 {
		 result.set(str.toString().toUpperCase());
	 }
	return result;
	 
 }
	
}
