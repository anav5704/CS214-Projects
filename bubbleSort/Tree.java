class Tree implements Comparable<Tree> {
    public Integer age;

    public Tree(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Tree other) {
        return age.compareTo(other.age);
    }
}