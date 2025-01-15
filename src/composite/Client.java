package composite;

public class Client {
    
    public static void main(String[] args) {
        // Leaf 노드
        File file1 = new File("파일1.txt");
        File file2 = new File("파일2.txt");
        
        // Composite 노드
        Folder folder1 = new Folder("폴더1");
        Folder folder2 = new Folder("폴더2");
        
        // Tree 구조 생성
        folder1.addComponent(file1);
        folder2.addComponent(file2);
        folder2.addComponent(folder1);
        
        // Tree 구조 출력
        folder2.showDetails();
    }
    
}

