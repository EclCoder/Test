package qp;

import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static h f50967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static h f50968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static h f50969l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f50970a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f50971b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f50972c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f50973d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f50974e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f50975f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f50976g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f50977h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f50978i;

    static {
        h hVar = new h();
        f50967j = hVar;
        hVar.f50970a = true;
        hVar.f50971b = false;
        hVar.f50972c = false;
        hVar.f50973d = false;
        hVar.f50974e = true;
        hVar.f50975f = false;
        hVar.f50976g = false;
        hVar.f50978i = 0;
        h hVar2 = new h();
        f50968k = hVar2;
        hVar2.f50970a = true;
        hVar2.f50971b = true;
        hVar2.f50972c = false;
        hVar2.f50973d = false;
        hVar2.f50974e = false;
        f50967j.f50978i = 1;
        h hVar3 = new h();
        f50969l = hVar3;
        hVar3.f50970a = false;
        hVar3.f50971b = true;
        hVar3.f50972c = false;
        hVar3.f50973d = true;
        hVar3.f50974e = false;
        hVar3.f50977h = false;
        hVar3.f50978i = 2;
    }

    h() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (this.f50971b) {
            stringBuffer.append("(");
            c(stringBuffer, clsArr);
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.f50972c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        c(stringBuffer, clsArr);
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i10]));
        }
    }

    String d(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    String e(int i10) {
        if (!this.f50973d) {
            return "";
        }
        String string = Modifier.toString(i10);
        if (string.length() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f50974e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f50970a);
    }

    String h(Class cls, String str, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z10 ? i(str).replace('$', '.') : str.replace('$', '.');
        }
        Class<?> componentType = cls.getComponentType();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(componentType, componentType.getName(), z10));
        stringBuffer.append("[]");
        return stringBuffer.toString();
    }

    String i(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
