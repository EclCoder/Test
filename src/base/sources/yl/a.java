package yl;

import gl.q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Iterable, ul.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0884a f58077d = new C0884a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f58078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f58079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58080c;

    /* JADX INFO: renamed from: yl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0884a {
        public /* synthetic */ C0884a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0884a() {
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f58078a = c10;
        this.f58079b = (char) nl.c.b(c10, c11, i10);
        this.f58080c = i10;
    }

    public final char a() {
        return this.f58078a;
    }

    public final char b() {
        return this.f58079b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public q iterator() {
        return new b(this.f58078a, this.f58079b, this.f58080c);
    }
}
