package s;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(String message) {
        s.h(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        s.h(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void c(String message) {
        s.h(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void d(String message) {
        s.h(message, "message");
        throw new NoSuchElementException(message);
    }
}
