package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements n0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class AbstractC0032a implements n0.a {
        protected static void c(Iterable iterable, List list) {
            x.a(iterable);
            if (!(iterable instanceof a0)) {
                if (iterable instanceof w0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    d(iterable, list);
                    return;
                }
            }
            List underlyingElements = ((a0) iterable).getUnderlyingElements();
            a0 a0Var = (a0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (a0Var.size() - size) + " is null.";
                    for (int size2 = a0Var.size() - 1; size2 >= size; size2--) {
                        a0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof g) {
                    a0Var.j((g) obj);
                } else if (obj instanceof byte[]) {
                    a0Var.j(g.g((byte[]) obj));
                } else {
                    a0Var.add((String) obj);
                }
            }
        }

        private static void d(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static UninitializedMessageException e(n0 n0Var) {
            return new UninitializedMessageException(n0Var);
        }
    }

    protected static void a(Iterable iterable, List list) {
        AbstractC0032a.c(iterable, list);
    }

    abstract int c(c1 c1Var);

    UninitializedMessageException d() {
        return new UninitializedMessageException(this);
    }

    public void e(OutputStream outputStream) {
        CodedOutputStream codedOutputStreamY = CodedOutputStream.Y(outputStream, CodedOutputStream.C(getSerializedSize()));
        b(codedOutputStreamY);
        codedOutputStreamY.V();
    }
}
