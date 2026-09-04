package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class i implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f3578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3581d = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3582a;

        static {
            int[] iArr = new int[n1.b.values().length];
            f3582a = iArr;
            try {
                iArr[n1.b.f3636j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3582a[n1.b.f3640n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3582a[n1.b.f3629c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3582a[n1.b.f3642p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3582a[n1.b.f3635i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3582a[n1.b.f3634h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3582a[n1.b.f3630d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3582a[n1.b.f3633g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3582a[n1.b.f3631e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3582a[n1.b.f3639m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3582a[n1.b.f3643q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3582a[n1.b.f3644r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3582a[n1.b.f3645s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3582a[n1.b.f3646t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3582a[n1.b.f3637k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3582a[n1.b.f3641o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3582a[n1.b.f3632f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private i(h hVar) {
        h hVar2 = (h) x.b(hVar, "input");
        this.f3578a = hVar2;
        hVar2.f3556d = this;
    }

    public static i f(h hVar) {
        i iVar = hVar.f3556d;
        return iVar != null ? iVar : new i(hVar);
    }

    private void g(Object obj, c1 c1Var, n nVar) {
        int i10 = this.f3580c;
        this.f3580c = n1.c(n1.a(this.f3579b), 4);
        try {
            c1Var.a(obj, this, nVar);
            if (this.f3579b != this.f3580c) {
                throw InvalidProtocolBufferException.m();
            }
            this.f3580c = i10;
        } catch (Throwable th2) {
            this.f3580c = i10;
            throw th2;
        }
    }

    private void h(Object obj, c1 c1Var, n nVar) throws InvalidProtocolBufferException {
        int iD = this.f3578a.D();
        h hVar = this.f3578a;
        if (hVar.f3553a >= hVar.f3554b) {
            throw InvalidProtocolBufferException.n();
        }
        int iM = hVar.m(iD);
        this.f3578a.f3553a++;
        c1Var.a(obj, this, nVar);
        this.f3578a.a(0);
        h hVar2 = this.f3578a;
        hVar2.f3553a--;
        hVar2.l(iM);
    }

    private Object i(n1.b bVar, Class cls, n nVar) {
        switch (a.f3582a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return l(cls, nVar);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object j(c1 c1Var, n nVar) {
        Object objNewInstance = c1Var.newInstance();
        g(objNewInstance, c1Var, nVar);
        c1Var.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    private Object k(c1 c1Var, n nVar) throws InvalidProtocolBufferException {
        Object objNewInstance = c1Var.newInstance();
        h(objNewInstance, c1Var, nVar);
        c1Var.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    private void n(int i10) throws InvalidProtocolBufferException {
        if (this.f3578a.e() != i10) {
            throw InvalidProtocolBufferException.r();
        }
    }

    private void o(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (n1.b(this.f3579b) != i10) {
            throw InvalidProtocolBufferException.j();
        }
    }

    private void p(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void q(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.m();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void a(Object obj, c1 c1Var, n nVar) throws InvalidProtocolBufferException {
        o(2);
        h(obj, c1Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void b(List list, c1 c1Var, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if (n1.b(this.f3579b) != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int i10 = this.f3579b;
        do {
            list.add(k(c1Var, nVar));
            if (this.f3578a.f() || this.f3581d != 0) {
                return;
            } else {
                iC = this.f3578a.C();
            }
        } while (iC == i10);
        this.f3581d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void c(Map map, g0.a aVar, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(2);
        int iM = this.f3578a.m(this.f3578a.D());
        Object objI = aVar.f3549b;
        Object objI2 = aVar.f3551d;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.f3578a.f()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objI = i(aVar.f3548a, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = i(aVar.f3550c, aVar.f3551d.getClass(), nVar);
                }
            } catch (Throwable th2) {
                this.f3578a.l(iM);
                throw th2;
            }
        }
        map.put(objI, objI2);
        this.f3578a.l(iM);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void d(Object obj, c1 c1Var, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(3);
        g(obj, c1Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void e(List list, c1 c1Var, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if (n1.b(this.f3579b) != 3) {
            throw InvalidProtocolBufferException.j();
        }
        int i10 = this.f3579b;
        do {
            list.add(j(c1Var, nVar));
            if (this.f3578a.f() || this.f3581d != 0) {
                return;
            } else {
                iC = this.f3578a.C();
            }
        } while (iC == i10);
        this.f3581d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int getFieldNumber() {
        int i10 = this.f3581d;
        if (i10 != 0) {
            this.f3579b = i10;
            this.f3581d = 0;
        } else {
            this.f3579b = this.f3578a.C();
        }
        int i11 = this.f3579b;
        if (i11 == 0 || i11 == this.f3580c) {
            return Integer.MAX_VALUE;
        }
        return n1.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int getTag() {
        return this.f3579b;
    }

    public Object l(Class cls, n nVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(2);
        return k(y0.a().c(cls), nVar);
    }

    public void m(List list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        int iC2;
        if (n1.b(this.f3579b) != 2) {
            throw InvalidProtocolBufferException.j();
        }
        if (!(list instanceof a0) || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        a0 a0Var = (a0) list;
        do {
            a0Var.j(readBytes());
            if (this.f3578a.f()) {
                return;
            } else {
                iC2 = this.f3578a.C();
            }
        } while (iC2 == this.f3579b);
        this.f3581d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(0);
        return this.f3578a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readBoolList(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof e) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 0) {
                this.f3578a.n();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            this.f3578a.D();
            this.f3578a.e();
            this.f3578a.n();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 0) {
            do {
                list.add(Boolean.valueOf(this.f3578a.n()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iE = this.f3578a.e() + this.f3578a.D();
        do {
            list.add(Boolean.valueOf(this.f3578a.n()));
        } while (this.f3578a.e() < iE);
        n(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public g readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(2);
        return this.f3578a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if (n1.b(this.f3579b) != 2) {
            throw InvalidProtocolBufferException.j();
        }
        do {
            list.add(readBytes());
            if (this.f3578a.f()) {
                return;
            } else {
                iC = this.f3578a.C();
            }
        } while (iC == this.f3579b);
        this.f3581d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(1);
        return this.f3578a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readDoubleList(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof k) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 1) {
                this.f3578a.p();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            q(this.f3578a.D());
            this.f3578a.e();
            this.f3578a.p();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 1) {
            do {
                list.add(Double.valueOf(this.f3578a.p()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iD = this.f3578a.D();
        q(iD);
        int iE = this.f3578a.e() + iD;
        do {
            list.add(Double.valueOf(this.f3578a.p()));
        } while (this.f3578a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(0);
        return this.f3578a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readEnumList(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof w) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 0) {
                this.f3578a.q();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            this.f3578a.D();
            this.f3578a.e();
            this.f3578a.q();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 0) {
            do {
                list.add(Integer.valueOf(this.f3578a.q()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iE = this.f3578a.e() + this.f3578a.D();
        do {
            list.add(Integer.valueOf(this.f3578a.q()));
        } while (this.f3578a.e() < iE);
        n(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(5);
        return this.f3578a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readFixed32List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof w) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB != 2) {
                if (iB != 5) {
                    throw InvalidProtocolBufferException.j();
                }
                this.f3578a.r();
                throw null;
            }
            p(this.f3578a.D());
            this.f3578a.e();
            this.f3578a.r();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 2) {
            int iD = this.f3578a.D();
            p(iD);
            int iE = this.f3578a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f3578a.r()));
            } while (this.f3578a.e() < iE);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.j();
        }
        do {
            list.add(Integer.valueOf(this.f3578a.r()));
            if (this.f3578a.f()) {
                return;
            } else {
                iC = this.f3578a.C();
            }
        } while (iC == this.f3579b);
        this.f3581d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(1);
        return this.f3578a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readFixed64List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof e0) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 1) {
                this.f3578a.s();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            q(this.f3578a.D());
            this.f3578a.e();
            this.f3578a.s();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 1) {
            do {
                list.add(Long.valueOf(this.f3578a.s()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iD = this.f3578a.D();
        q(iD);
        int iE = this.f3578a.e() + iD;
        do {
            list.add(Long.valueOf(this.f3578a.s()));
        } while (this.f3578a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(5);
        return this.f3578a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readFloatList(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof t) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB != 2) {
                if (iB != 5) {
                    throw InvalidProtocolBufferException.j();
                }
                this.f3578a.t();
                throw null;
            }
            p(this.f3578a.D());
            this.f3578a.e();
            this.f3578a.t();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 2) {
            int iD = this.f3578a.D();
            p(iD);
            int iE = this.f3578a.e() + iD;
            do {
                list.add(Float.valueOf(this.f3578a.t()));
            } while (this.f3578a.e() < iE);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.j();
        }
        do {
            list.add(Float.valueOf(this.f3578a.t()));
            if (this.f3578a.f()) {
                return;
            } else {
                iC = this.f3578a.C();
            }
        } while (iC == this.f3579b);
        this.f3581d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(0);
        return this.f3578a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readInt32List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof w) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 0) {
                this.f3578a.u();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            this.f3578a.D();
            this.f3578a.e();
            this.f3578a.u();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 0) {
            do {
                list.add(Integer.valueOf(this.f3578a.u()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iE = this.f3578a.e() + this.f3578a.D();
        do {
            list.add(Integer.valueOf(this.f3578a.u()));
        } while (this.f3578a.e() < iE);
        n(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(0);
        return this.f3578a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readInt64List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof e0) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 0) {
                this.f3578a.v();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            this.f3578a.D();
            this.f3578a.e();
            this.f3578a.v();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 0) {
            do {
                list.add(Long.valueOf(this.f3578a.v()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iE = this.f3578a.e() + this.f3578a.D();
        do {
            list.add(Long.valueOf(this.f3578a.v()));
        } while (this.f3578a.e() < iE);
        n(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(5);
        return this.f3578a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof w) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB != 2) {
                if (iB != 5) {
                    throw InvalidProtocolBufferException.j();
                }
                this.f3578a.w();
                throw null;
            }
            p(this.f3578a.D());
            this.f3578a.e();
            this.f3578a.w();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 2) {
            int iD = this.f3578a.D();
            p(iD);
            int iE = this.f3578a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f3578a.w()));
            } while (this.f3578a.e() < iE);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.j();
        }
        do {
            list.add(Integer.valueOf(this.f3578a.w()));
            if (this.f3578a.f()) {
                return;
            } else {
                iC = this.f3578a.C();
            }
        } while (iC == this.f3579b);
        this.f3581d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(1);
        return this.f3578a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof e0) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 1) {
                this.f3578a.x();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            q(this.f3578a.D());
            this.f3578a.e();
            this.f3578a.x();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 1) {
            do {
                list.add(Long.valueOf(this.f3578a.x()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iD = this.f3578a.D();
        q(iD);
        int iE = this.f3578a.e() + iD;
        do {
            list.add(Long.valueOf(this.f3578a.x()));
        } while (this.f3578a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(0);
        return this.f3578a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readSInt32List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof w) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 0) {
                this.f3578a.y();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            this.f3578a.D();
            this.f3578a.e();
            this.f3578a.y();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 0) {
            do {
                list.add(Integer.valueOf(this.f3578a.y()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iE = this.f3578a.e() + this.f3578a.D();
        do {
            list.add(Integer.valueOf(this.f3578a.y()));
        } while (this.f3578a.e() < iE);
        n(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(0);
        return this.f3578a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readSInt64List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof e0) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 0) {
                this.f3578a.z();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            this.f3578a.D();
            this.f3578a.e();
            this.f3578a.z();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 0) {
            do {
                list.add(Long.valueOf(this.f3578a.z()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iE = this.f3578a.e() + this.f3578a.D();
        do {
            list.add(Long.valueOf(this.f3578a.z()));
        } while (this.f3578a.e() < iE);
        n(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(2);
        return this.f3578a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(2);
        return this.f3578a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(0);
        return this.f3578a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readUInt32List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof w) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 0) {
                this.f3578a.D();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            this.f3578a.D();
            this.f3578a.e();
            this.f3578a.D();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 0) {
            do {
                list.add(Integer.valueOf(this.f3578a.D()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iE = this.f3578a.e() + this.f3578a.D();
        do {
            list.add(Integer.valueOf(this.f3578a.D()));
        } while (this.f3578a.e() < iE);
        n(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        o(0);
        return this.f3578a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public void readUInt64List(List list) throws InvalidProtocolBufferException {
        int iC;
        if (list instanceof e0) {
            android.support.v4.media.session.b.a(list);
            int iB = n1.b(this.f3579b);
            if (iB == 0) {
                this.f3578a.E();
                throw null;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.j();
            }
            this.f3578a.D();
            this.f3578a.e();
            this.f3578a.E();
            throw null;
        }
        int iB2 = n1.b(this.f3579b);
        if (iB2 == 0) {
            do {
                list.add(Long.valueOf(this.f3578a.E()));
                if (this.f3578a.f()) {
                    return;
                } else {
                    iC = this.f3578a.C();
                }
            } while (iC == this.f3579b);
            this.f3581d = iC;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.j();
        }
        int iE = this.f3578a.e() + this.f3578a.D();
        do {
            list.add(Long.valueOf(this.f3578a.E()));
        } while (this.f3578a.e() < iE);
        n(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public boolean skipField() {
        int i10;
        if (this.f3578a.f() || (i10 = this.f3579b) == this.f3580c) {
            return false;
        }
        return this.f3578a.F(i10);
    }
}
