package org.apache.http.message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49431c;

    public u(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.f49429a = i10;
        this.f49430b = i11;
        this.f49431c = i10;
    }

    public boolean a() {
        return this.f49431c >= this.f49430b;
    }

    public int b() {
        return this.f49431c;
    }

    public int c() {
        return this.f49430b;
    }

    public void d(int i10) {
        if (i10 < this.f49429a) {
            throw new IndexOutOfBoundsException("pos: " + i10 + " < lowerBound: " + this.f49429a);
        }
        if (i10 <= this.f49430b) {
            this.f49431c = i10;
            return;
        }
        throw new IndexOutOfBoundsException("pos: " + i10 + " > upperBound: " + this.f49430b);
    }

    public String toString() {
        return '[' + Integer.toString(this.f49429a) + '>' + Integer.toString(this.f49431c) + '>' + Integer.toString(this.f49430b) + ']';
    }
}
