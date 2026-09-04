package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.a f999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected k f1002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1003j;

    public a(Context context, int i10, int i11) {
        this.f994a = context;
        this.f997d = LayoutInflater.from(context);
        this.f1000g = i10;
        this.f1001h = i11;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f999f;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f999f = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        j.a aVar = this.f999f;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f996c;
        }
        return aVar.c(eVar);
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f1003j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f1002i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f996c;
        int i10 = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList arrayListG = this.f996c.G();
            int size = arrayListG.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) arrayListG.get(i12);
                if (t(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewQ = q(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewQ.setPressed(false);
                        viewQ.jumpDrawablesToCurrentState();
                    }
                    if (viewQ != childAt) {
                        l(viewQ, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!o(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Context context, e eVar) {
        this.f995b = context;
        this.f998e = LayoutInflater.from(context);
        this.f996c = eVar;
    }

    protected void l(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1002i).addView(view, i10);
    }

    public abstract void m(g gVar, k.a aVar);

    public k.a n(ViewGroup viewGroup) {
        return (k.a) this.f997d.inflate(this.f1001h, viewGroup, false);
    }

    protected boolean o(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a p() {
        return this.f999f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View q(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarN = view instanceof k.a ? (k.a) view : n(viewGroup);
        m(gVar, aVarN);
        return (View) aVarN;
    }

    public k r(ViewGroup viewGroup) {
        if (this.f1002i == null) {
            k kVar = (k) this.f997d.inflate(this.f1000g, viewGroup, false);
            this.f1002i = kVar;
            kVar.a(this.f996c);
            h(true);
        }
        return this.f1002i;
    }

    public void s(int i10) {
        this.f1003j = i10;
    }

    public abstract boolean t(int i10, g gVar);
}
