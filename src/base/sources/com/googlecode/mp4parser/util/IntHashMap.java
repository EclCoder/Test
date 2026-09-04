package com.googlecode.mp4parser.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class IntHashMap {
    private transient int count;
    private float loadFactor;
    private transient Entry[] table;
    private int threshold;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class Entry {
        int hash;
        int key;
        Entry next;
        Object value;

        protected Entry(int i10, int i11, Object obj, Entry entry) {
            this.hash = i10;
            this.key = i11;
            this.value = obj;
            this.next = entry;
        }
    }

    public IntHashMap() {
        this(20, 0.75f);
    }

    public synchronized void clear() {
        Entry[] entryArr = this.table;
        int length = entryArr.length;
        while (true) {
            length--;
            if (length < 0) {
                this.count = 0;
            } else {
                entryArr[length] = null;
            }
        }
    }

    public boolean contains(Object obj) {
        obj.getClass();
        Entry[] entryArr = this.table;
        int length = entryArr.length;
        while (true) {
            int i10 = length - 1;
            if (length <= 0) {
                return false;
            }
            for (Entry entry = entryArr[i10]; entry != null; entry = entry.next) {
                if (entry.value.equals(obj)) {
                    return true;
                }
            }
            length = i10;
        }
    }

    public boolean containsKey(int i10) {
        Entry[] entryArr = this.table;
        for (Entry entry = entryArr[(Integer.MAX_VALUE & i10) % entryArr.length]; entry != null; entry = entry.next) {
            if (entry.hash == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return contains(obj);
    }

    public Object get(int i10) {
        Entry[] entryArr = this.table;
        for (Entry entry = entryArr[(Integer.MAX_VALUE & i10) % entryArr.length]; entry != null; entry = entry.next) {
            if (entry.hash == i10) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public Object put(int i10, Object obj) {
        Entry[] entryArr = this.table;
        int i11 = Integer.MAX_VALUE & i10;
        int length = i11 % entryArr.length;
        for (Entry entry = entryArr[length]; entry != null; entry = entry.next) {
            if (entry.hash == i10) {
                Object obj2 = entry.value;
                entry.value = obj;
                return obj2;
            }
        }
        if (this.count >= this.threshold) {
            rehash();
            entryArr = this.table;
            length = i11 % entryArr.length;
        }
        entryArr[length] = new Entry(i10, i10, obj, entryArr[length]);
        this.count++;
        return null;
    }

    protected void rehash() {
        Entry[] entryArr = this.table;
        int length = entryArr.length;
        int i10 = (length * 2) + 1;
        Entry[] entryArr2 = new Entry[i10];
        this.threshold = (int) (i10 * this.loadFactor);
        this.table = entryArr2;
        while (true) {
            int i11 = length - 1;
            if (length <= 0) {
                return;
            }
            Entry entry = entryArr[i11];
            while (entry != null) {
                Entry entry2 = entry.next;
                int i12 = (entry.hash & Integer.MAX_VALUE) % i10;
                entry.next = entryArr2[i12];
                entryArr2[i12] = entry;
                entry = entry2;
            }
            length = i11;
        }
    }

    public Object remove(int i10) {
        Entry[] entryArr = this.table;
        int length = (Integer.MAX_VALUE & i10) % entryArr.length;
        Entry entry = null;
        for (Entry entry2 = entryArr[length]; entry2 != null; entry2 = entry2.next) {
            if (entry2.hash == i10) {
                if (entry != null) {
                    entry.next = entry2.next;
                } else {
                    entryArr[length] = entry2.next;
                }
                this.count--;
                Object obj = entry2.value;
                entry2.value = null;
                return obj;
            }
            entry = entry2;
        }
        return null;
    }

    public int size() {
        return this.count;
    }

    public IntHashMap(int i10) {
        this(i10, 0.75f);
    }

    public IntHashMap(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        if (f10 > 0.0f) {
            i10 = i10 == 0 ? 1 : i10;
            this.loadFactor = f10;
            this.table = new Entry[i10];
            this.threshold = (int) (i10 * f10);
            return;
        }
        throw new IllegalArgumentException("Illegal Load: " + f10);
    }
}
