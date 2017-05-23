private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); 
        out.writeInt(x);
        out.writeInt(y);
        out.writeInt(z);
 
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {

        in.defaultReadObject();
        x=in.readInt();
        y=in.readInt();
        z=in.readInt();
    }
