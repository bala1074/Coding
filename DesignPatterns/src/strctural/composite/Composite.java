package strctural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	private String name;
	
	private List<Component> components = new ArrayList<>();
	
	public Composite(String name) {
		this.name=name;
	}
	
	
	public void addComponet(Component component){
		this.components.add(component);
	}
	
	@Override
	public void showPrice() {
		for(Component component: components){
			component.showPrice();
		}
	}

}
