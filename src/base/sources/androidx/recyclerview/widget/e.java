package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p f6875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6876b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f6877c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f6878d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f6879e = null;

    public e(p pVar) {
        this.f6875a = pVar;
    }

    @Override // androidx.recyclerview.widget.p
    public void a(int i10, int i11) {
        int i12;
        if (this.f6876b == 1 && i10 >= (i12 = this.f6877c)) {
            int i13 = this.f6878d;
            if (i10 <= i12 + i13) {
                this.f6878d = i13 + i11;
                this.f6877c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f6877c = i10;
        this.f6878d = i11;
        this.f6876b = 1;
    }

    @Override // androidx.recyclerview.widget.p
    public void b(int i10, int i11) {
        int i12;
        if (this.f6876b == 2 && (i12 = this.f6877c) >= i10 && i12 <= i10 + i11) {
            this.f6878d += i11;
            this.f6877c = i10;
        } else {
            e();
            this.f6877c = i10;
            this.f6878d = i11;
            this.f6876b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.p
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.f6876b == 3) {
            int i13 = this.f6877c;
            int i14 = this.f6878d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f6879e == obj) {
                this.f6877c = Math.min(i10, i13);
                this.f6878d = Math.max(i14 + i13, i12) - this.f6877c;
                return;
            }
        }
        e();
        this.f6877c = i10;
        this.f6878d = i11;
        this.f6879e = obj;
        this.f6876b = 3;
    }

    @Override // androidx.recyclerview.widget.p
    public void d(int i10, int i11) {
        e();
        this.f6875a.d(i10, i11);
    }

    public void e() {
        int i10 = this.f6876b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f6875a.a(this.f6877c, this.f6878d);
        } else if (i10 == 2) {
            this.f6875a.b(this.f6877c, this.f6878d);
        } else if (i10 == 3) {
            this.f6875a.c(this.f6877c, this.f6878d, this.f6879e);
        }
        this.f6879e = null;
        this.f6876b = 0;
    }
}
