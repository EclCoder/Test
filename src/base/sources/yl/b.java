package yl;

import gl.q;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f58083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58084d;

    public b(char c10, char c11, int i10) {
        this.f58081a = i10;
        this.f58082b = c11;
        boolean z10 = false;
        if (i10 <= 0 ? s.i(c10, c11) >= 0 : s.i(c10, c11) <= 0) {
            z10 = true;
        }
        this.f58083c = z10;
        this.f58084d = z10 ? c10 : c11;
    }

    @Override // gl.q
    public char a() {
        int i10 = this.f58084d;
        if (i10 != this.f58082b) {
            this.f58084d = this.f58081a + i10;
        } else {
            if (!this.f58083c) {
                throw new NoSuchElementException();
            }
            this.f58083c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58083c;
    }
}
