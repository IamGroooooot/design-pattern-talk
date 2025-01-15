package composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Folder implements FileSystemComponent {
    private final String name;
    private List<FileSystemComponent> components = new ArrayList<>();
    
    public Folder(String name) {
        this.name = name;
    }
    
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }
    
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }
    
    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}