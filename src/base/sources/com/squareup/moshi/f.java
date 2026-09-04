package com.squareup.moshi;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f35460a;

        a(f fVar) {
            this.f35460a = fVar;
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(i iVar) {
            return this.f35460a.fromJson(iVar);
        }

        @Override // com.squareup.moshi.f
        boolean isLenient() {
            return this.f35460a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, Object obj) {
            boolean zR = oVar.r();
            oVar.N0(true);
            try {
                this.f35460a.toJson(oVar, obj);
            } finally {
                oVar.N0(zR);
            }
        }

        public String toString() {
            return this.f35460a + ".serializeNulls()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f35462a;

        b(f fVar) {
            this.f35462a = fVar;
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(i iVar) {
            boolean zR = iVar.r();
            iVar.V0(true);
            try {
                return this.f35462a.fromJson(iVar);
            } finally {
                iVar.V0(zR);
            }
        }

        @Override // com.squareup.moshi.f
        boolean isLenient() {
            return true;
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, Object obj) {
            boolean zS = oVar.s();
            oVar.K0(true);
            try {
                this.f35462a.toJson(oVar, obj);
            } finally {
                oVar.K0(zS);
            }
        }

        public String toString() {
            return this.f35462a + ".lenient()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f35464a;

        c(f fVar) {
            this.f35464a = fVar;
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(i iVar) {
            boolean zM = iVar.m();
            iVar.U0(true);
            try {
                return this.f35464a.fromJson(iVar);
            } finally {
                iVar.U0(zM);
            }
        }

        @Override // com.squareup.moshi.f
        boolean isLenient() {
            return this.f35464a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, Object obj) {
            this.f35464a.toJson(oVar, obj);
        }

        public String toString() {
            return this.f35464a + ".failOnUnknown()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f35466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35467b;

        d(f fVar, String str) {
            this.f35466a = fVar;
            this.f35467b = str;
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(i iVar) {
            return this.f35466a.fromJson(iVar);
        }

        @Override // com.squareup.moshi.f
        boolean isLenient() {
            return this.f35466a.isLenient();
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, Object obj) {
            String strQ = oVar.q();
            oVar.F0(this.f35467b);
            try {
                this.f35466a.toJson(oVar, obj);
            } finally {
                oVar.F0(strQ);
            }
        }

        public String toString() {
            return this.f35466a + ".indent(\"" + this.f35467b + "\")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        f a(Type type, Set set, r rVar);
    }

    public final f failOnUnknown() {
        return new c(this);
    }

    public abstract Object fromJson(i iVar);

    public final Object fromJson(xn.g gVar) {
        return fromJson(i.m0(gVar));
    }

    public final Object fromJsonValue(Object obj) {
        try {
            return fromJson(new m(obj));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public f indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    boolean isLenient() {
        return false;
    }

    public final f lenient() {
        return new b(this);
    }

    public final f nonNull() {
        return this instanceof vj.a ? this : new vj.a(this);
    }

    public final f nullSafe() {
        return this instanceof vj.b ? this : new vj.b(this);
    }

    public final f serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(o oVar, Object obj);

    public final void toJson(xn.f fVar, Object obj) {
        toJson(o.d0(fVar), obj);
    }

    public final Object toJsonValue(Object obj) {
        n nVar = new n();
        try {
            toJson(nVar, obj);
            return nVar.Z0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Object fromJson(String str) {
        i iVarM0 = i.m0(new xn.e().N(str));
        Object objFromJson = fromJson(iVarM0);
        if (isLenient() || iVarM0.p0() == i.b.END_DOCUMENT) {
            return objFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final String toJson(Object obj) {
        xn.e eVar = new xn.e();
        try {
            toJson(eVar, obj);
            return eVar.X0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
