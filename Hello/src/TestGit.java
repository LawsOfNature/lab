
public class TestGit {
	private TestGit() {
		System.out.println("Say you say me.");
	}
	
	public static TestGit TestGitFactory() {
		return new TestGit();
	}
}
