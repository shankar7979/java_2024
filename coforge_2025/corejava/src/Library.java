import java.util.Objects;

public class Library {

	private int libraryId;
	private String libraryName;

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	
	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(libraryId, libraryName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return libraryId == other.libraryId && Objects.equals(libraryName, other.libraryName);
	}
	

	public static void main(String[] args) {
		Library library = new Library();
		library.setLibraryId(6766776);
		library.setLibraryName("computer library");

		Library library1 = new Library();
		library1.setLibraryId(6766776);
		library1.setLibraryName("computer library");

		System.out.println(library);
		System.out.println(library.equals(library1));
		
		System.out.println(library.hashCode());
		System.out.println(library1.hashCode());
	}

	
}
