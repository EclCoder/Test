package sc;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52299a;

    private i(String str) {
        this.f52299a = (String) p.o(str);
    }

    public static i f(char c10) {
        return new i(String.valueOf(c10));
    }

    public static i g(String str) {
        return new i(str);
    }

    public Appendable a(Appendable appendable, Iterator it) throws IOException {
        p.o(appendable);
        if (it.hasNext()) {
            appendable.append(h(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f52299a);
                appendable.append(h(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String d(Iterable iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator it) {
        return c(new StringBuilder(), it).toString();
    }

    CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
