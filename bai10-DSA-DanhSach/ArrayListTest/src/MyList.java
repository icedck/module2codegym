import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    //chèn 1 phần tử vào vị trí index
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = e;
        size++;
    }

    //thêm phần tử vào cuối
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    //xóa phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E oldValue = (E) elements[index];
        int newMoved = size - index - 1;
        if (newMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, newMoved);
        }
        elements[--size] = null;
        return oldValue;
    }

    //trả về số lượng phần tử hiện có
    public int size() {
        return size;
    }

    //trả về một bản sao nông
    public E clone(){
        MyList<E> newList = new MyList<>(elements.length);
        newList.size = this.size;
        newList.elements = Arrays.copyOf(elements, this.elements.length);
        return (E) newList;
    }

    //kiểm tra đối tượng có trong mảng hay ko
    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    //trả về chỉ số phần tử trong mảng
    public int indexOf(E e) {
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (e.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    // mở rộng elements bằng cách tạo ra mảng mới
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(minCapacity, elements.length * 2);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }


    // trả về phần tử tại vị trí i
    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
