package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m0.d f6822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f6823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f6824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0076a f6825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f6826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f6827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final r f6828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6829h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface InterfaceC0076a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.g0 f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f6832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6833d;

        b(int i10, int i11, int i12, Object obj) {
            this.f6830a = i10;
            this.f6831b = i11;
            this.f6833d = i12;
            this.f6832c = obj;
        }

        String a() {
            int i10 = this.f6830a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f6830a;
            if (i10 != bVar.f6830a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f6833d - this.f6831b) == 1 && this.f6833d == bVar.f6831b && this.f6831b == bVar.f6833d) {
                return true;
            }
            if (this.f6833d != bVar.f6833d || this.f6831b != bVar.f6831b) {
                return false;
            }
            Object obj2 = this.f6832c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f6832c)) {
                    return false;
                }
            } else if (bVar.f6832c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f6830a * 31) + this.f6831b) * 31) + this.f6833d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f6831b + "c:" + this.f6833d + ",p:" + this.f6832c + "]";
        }
    }

    a(InterfaceC0076a interfaceC0076a) {
        this(interfaceC0076a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f6831b;
        int i11 = bVar.f6833d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f6825d.f(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    v(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f6833d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f6831b;
        int i11 = bVar.f6833d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f6825d.f(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(a(4, i13, i12, bVar.f6832c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    v(a(4, i13, i12, bVar.f6832c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f6833d) {
            Object obj = bVar.f6832c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f6824c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f6824c.get(i11);
            int i12 = bVar.f6830a;
            if (i12 == 8) {
                if (n(bVar.f6833d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f6831b;
                int i14 = bVar.f6833d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f6830a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f6831b, i11);
        int i12 = bVar.f6831b;
        int i13 = bVar.f6830a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f6833d; i15++) {
            int iZ2 = z(bVar.f6831b + (i10 * i15), bVar.f6830a);
            int i16 = bVar.f6830a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i16, iZ, i14, bVar.f6832c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f6830a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f6832c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f6830a, iZ, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    private void v(b bVar) {
        this.f6824c.add(bVar);
        int i10 = bVar.f6830a;
        if (i10 == 1) {
            this.f6825d.g(bVar.f6831b, bVar.f6833d);
            return;
        }
        if (i10 == 2) {
            this.f6825d.d(bVar.f6831b, bVar.f6833d);
            return;
        }
        if (i10 == 4) {
            this.f6825d.e(bVar.f6831b, bVar.f6833d, bVar.f6832c);
        } else {
            if (i10 == 8) {
                this.f6825d.a(bVar.f6831b, bVar.f6833d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f6824c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f6824c.get(size);
            int i14 = bVar.f6830a;
            if (i14 == 8) {
                int i15 = bVar.f6831b;
                int i16 = bVar.f6833d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f6831b = i15 + 1;
                            bVar.f6833d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f6831b = i15 - 1;
                            bVar.f6833d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f6833d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f6833d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f6831b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f6831b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f6831b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f6833d;
                    } else if (i14 == 2) {
                        i10 += bVar.f6833d;
                    }
                } else if (i11 == 1) {
                    bVar.f6831b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f6831b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f6824c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f6824c.get(size2);
            if (bVar2.f6830a == 8) {
                int i18 = bVar2.f6833d;
                if (i18 == bVar2.f6831b || i18 < 0) {
                    this.f6824c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f6833d <= 0) {
                this.f6824c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.r.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f6822a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f6830a = i10;
        bVar.f6831b = i11;
        bVar.f6833d = i12;
        bVar.f6832c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.r.a
    public void b(b bVar) {
        if (this.f6827f) {
            return;
        }
        bVar.f6832c = null;
        this.f6822a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f6823b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f6823b.get(i11);
            int i12 = bVar.f6830a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f6831b;
                    if (i13 <= i10) {
                        int i14 = bVar.f6833d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f6831b;
                    if (i15 == i10) {
                        i10 = bVar.f6833d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f6833d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f6831b <= i10) {
                i10 += bVar.f6833d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f6824c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6825d.c((b) this.f6824c.get(i10));
        }
        x(this.f6824c);
        this.f6829h = 0;
    }

    void j() {
        i();
        int size = this.f6823b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f6823b.get(i10);
            int i11 = bVar.f6830a;
            if (i11 == 1) {
                this.f6825d.c(bVar);
                this.f6825d.g(bVar.f6831b, bVar.f6833d);
            } else if (i11 == 2) {
                this.f6825d.c(bVar);
                this.f6825d.h(bVar.f6831b, bVar.f6833d);
            } else if (i11 == 4) {
                this.f6825d.c(bVar);
                this.f6825d.e(bVar.f6831b, bVar.f6833d, bVar.f6832c);
            } else if (i11 == 8) {
                this.f6825d.c(bVar);
                this.f6825d.a(bVar.f6831b, bVar.f6833d);
            }
            Runnable runnable = this.f6826e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f6823b);
        this.f6829h = 0;
    }

    void l(b bVar, int i10) {
        this.f6825d.b(bVar);
        int i11 = bVar.f6830a;
        if (i11 == 2) {
            this.f6825d.h(i10, bVar.f6833d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f6825d.e(i10, bVar.f6833d, bVar.f6832c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f6824c.size();
        while (i11 < size) {
            b bVar = (b) this.f6824c.get(i11);
            int i12 = bVar.f6830a;
            if (i12 == 8) {
                int i13 = bVar.f6831b;
                if (i13 == i10) {
                    i10 = bVar.f6833d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f6833d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f6831b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f6833d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f6833d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f6829h) != 0;
    }

    boolean p() {
        return this.f6823b.size() > 0;
    }

    boolean q() {
        return (this.f6824c.isEmpty() || this.f6823b.isEmpty()) ? false : true;
    }

    boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f6823b.add(a(4, i10, i11, obj));
        this.f6829h |= 4;
        return this.f6823b.size() == 1;
    }

    boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f6823b.add(a(1, i10, i11, null));
        this.f6829h |= 1;
        return this.f6823b.size() == 1;
    }

    boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f6823b.add(a(8, i10, i11, null));
        this.f6829h |= 8;
        return this.f6823b.size() == 1;
    }

    boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f6823b.add(a(2, i10, i11, null));
        this.f6829h |= 2;
        return this.f6823b.size() == 1;
    }

    void w() {
        this.f6828g.b(this.f6823b);
        int size = this.f6823b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f6823b.get(i10);
            int i11 = bVar.f6830a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f6826e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f6823b.clear();
    }

    void x(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((b) list.get(i10));
        }
        list.clear();
    }

    void y() {
        x(this.f6823b);
        x(this.f6824c);
        this.f6829h = 0;
    }

    a(InterfaceC0076a interfaceC0076a, boolean z10) {
        this.f6822a = new m0.e(30);
        this.f6823b = new ArrayList();
        this.f6824c = new ArrayList();
        this.f6829h = 0;
        this.f6825d = interfaceC0076a;
        this.f6827f = z10;
        this.f6828g = new r(this);
    }
}
