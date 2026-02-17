import com.kms.katalon.core.annotation.Keyword

public class test2 {
	
	@Keyword
	def hello() {
		println "Hello broo"
	}
	
	@Keyword(keywordObject = "Browser")
	def helloUser(String user) {
		println("Hello "+user)
	}
}
