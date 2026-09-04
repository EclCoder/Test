package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f3583a = 100;

    i1() {
    }

    private final void l(Object obj, b1 b1Var, int i10) {
        while (b1Var.getFieldNumber() != Integer.MAX_VALUE && m(obj, b1Var, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, g gVar);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, b1 b1Var, int i10) throws InvalidProtocolBufferException {
        int tag = b1Var.getTag();
        int iA = n1.a(tag);
        int iB = n1.b(tag);
        if (iB == 0) {
            e(obj, iA, b1Var.readInt64());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, b1Var.readFixed64());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, b1Var.readBytes());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.j();
            }
            a(obj, iA, b1Var.readFixed32());
            return true;
        }
        Object objN = n();
        int iC = n1.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f3583a) {
            throw InvalidProtocolBufferException.n();
        }
        l(objN, b1Var, i11);
        if (iC != b1Var.getTag()) {
            throw InvalidProtocolBufferException.g();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(b1 b1Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, o1 o1Var);

    abstract void t(Object obj, o1 o1Var);
}
