package by.academy.lesson16;


public class HeavyBox  implements Comparable<HeavyBox>{
	private int weight;
	 private int width;
	 private int height;
	 private int depth;

	 public HeavyBox(int w, int h, int d, int m) {
	  width = w;
	  height = h;
	  depth = d;
	  weight = m;
	 }

	 @Override
	 public int compareTo(HeavyBox hb) {
	  return -(weight - hb.weight);
	 }

	 @Override
	 public String toString() {
	  StringBuilder builder = new StringBuilder();
	  builder.append("HeavyBox [weight=");
	  builder.append(weight);
	  builder.append(", width=");
	  builder.append(width);
	  builder.append(", height=");
	  builder.append(height);
	  builder.append(", depth=");
	  builder.append(depth);
	  builder.append("]");
	  return builder.toString();
	 }

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	 
}
