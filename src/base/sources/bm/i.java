package bm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i implements Iterator, ul.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f9132f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f9133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9137e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(CharSequence string) {
        kotlin.jvm.internal.s.h(string, "string");
        this.f9133a = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9134b = 0;
        int i10 = this.f9136d;
        int i11 = this.f9135c;
        this.f9135c = this.f9137e + i10;
        return this.f9133a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f9134b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f9137e < 0) {
            this.f9134b = 2;
            return false;
        }
        int length = this.f9133a.length();
        int length2 = this.f9133a.length();
        for (int i13 = this.f9135c; i13 < length2; i13++) {
            char cCharAt = this.f9133a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f9133a.length() && this.f9133a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f9134b = 1;
                this.f9137e = i10;
                this.f9136d = length;
                return true;
            }
        }
        i10 = -1;
        this.f9134b = 1;
        this.f9137e = i10;
        this.f9136d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
