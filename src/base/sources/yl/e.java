package yl;

import gl.j0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f58093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58094d;

    public e(int i10, int i11, int i12) {
        this.f58091a = i12;
        this.f58092b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f58093c = z10;
        this.f58094d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58093c;
    }

    @Override // gl.j0
    public int nextInt() {
        int i10 = this.f58094d;
        if (i10 != this.f58092b) {
            this.f58094d = this.f58091a + i10;
            return i10;
        }
        if (!this.f58093c) {
            throw new NoSuchElementException();
        }
        this.f58093c = false;
        return i10;
    }
}
