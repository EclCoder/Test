package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.collection.u f6834a = new androidx.collection.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.collection.l f6835b = new androidx.collection.l();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static m0.d f6836d = new m0.e(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.n.b f6838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.n.b f6839c;

        private a() {
        }

        static void a() {
            while (f6836d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f6836d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f6837a = 0;
            aVar.f6838b = null;
            aVar.f6839c = null;
            f6836d.a(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        void a(RecyclerView.g0 g0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2);

        void b(RecyclerView.g0 g0Var);

        void c(RecyclerView.g0 g0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2);

        void d(RecyclerView.g0 g0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2);
    }

    a0() {
    }

    private RecyclerView.n.b l(RecyclerView.g0 g0Var, int i10) {
        a aVar;
        RecyclerView.n.b bVar;
        int iG = this.f6834a.g(g0Var);
        if (iG >= 0 && (aVar = (a) this.f6834a.m(iG)) != null) {
            int i11 = aVar.f6837a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f6837a = i12;
                if (i10 == 4) {
                    bVar = aVar.f6838b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f6839c;
                }
                if ((i12 & 12) == 0) {
                    this.f6834a.k(iG);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.g0 g0Var, RecyclerView.n.b bVar) {
        a aVarB = (a) this.f6834a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f6834a.put(g0Var, aVarB);
        }
        aVarB.f6837a |= 2;
        aVarB.f6838b = bVar;
    }

    void b(RecyclerView.g0 g0Var) {
        a aVarB = (a) this.f6834a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f6834a.put(g0Var, aVarB);
        }
        aVarB.f6837a |= 1;
    }

    void c(long j10, RecyclerView.g0 g0Var) {
        this.f6835b.i(j10, g0Var);
    }

    void d(RecyclerView.g0 g0Var, RecyclerView.n.b bVar) {
        a aVarB = (a) this.f6834a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f6834a.put(g0Var, aVarB);
        }
        aVarB.f6839c = bVar;
        aVarB.f6837a |= 8;
    }

    void e(RecyclerView.g0 g0Var, RecyclerView.n.b bVar) {
        a aVarB = (a) this.f6834a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f6834a.put(g0Var, aVarB);
        }
        aVarB.f6838b = bVar;
        aVarB.f6837a |= 4;
    }

    void f() {
        this.f6834a.clear();
        this.f6835b.b();
    }

    RecyclerView.g0 g(long j10) {
        return (RecyclerView.g0) this.f6835b.e(j10);
    }

    boolean h(RecyclerView.g0 g0Var) {
        a aVar = (a) this.f6834a.get(g0Var);
        return (aVar == null || (aVar.f6837a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.g0 g0Var) {
        a aVar = (a) this.f6834a.get(g0Var);
        return (aVar == null || (aVar.f6837a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.g0 g0Var) {
        p(g0Var);
    }

    RecyclerView.n.b m(RecyclerView.g0 g0Var) {
        return l(g0Var, 8);
    }

    RecyclerView.n.b n(RecyclerView.g0 g0Var) {
        return l(g0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.f6834a.size() - 1; size >= 0; size--) {
            RecyclerView.g0 g0Var = (RecyclerView.g0) this.f6834a.i(size);
            a aVar = (a) this.f6834a.k(size);
            int i10 = aVar.f6837a;
            if ((i10 & 3) == 3) {
                bVar.b(g0Var);
            } else if ((i10 & 1) != 0) {
                RecyclerView.n.b bVar2 = aVar.f6838b;
                if (bVar2 == null) {
                    bVar.b(g0Var);
                } else {
                    bVar.c(g0Var, bVar2, aVar.f6839c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(g0Var, aVar.f6838b, aVar.f6839c);
            } else if ((i10 & 12) == 12) {
                bVar.d(g0Var, aVar.f6838b, aVar.f6839c);
            } else if ((i10 & 4) != 0) {
                bVar.c(g0Var, aVar.f6838b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(g0Var, aVar.f6838b, aVar.f6839c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.g0 g0Var) {
        a aVar = (a) this.f6834a.get(g0Var);
        if (aVar == null) {
            return;
        }
        aVar.f6837a &= -2;
    }

    void q(RecyclerView.g0 g0Var) {
        for (int iL = this.f6835b.l() - 1; iL >= 0; iL--) {
            if (g0Var == this.f6835b.m(iL)) {
                this.f6835b.k(iL);
                break;
            }
        }
        a aVar = (a) this.f6834a.remove(g0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
