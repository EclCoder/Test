package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f18593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckedTextView f18594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckedTextView f18595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f18596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f18597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f18598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private mb.w f18601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CheckedTextView[][] f18602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Comparator f18604m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.a f18606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18607b;

        public c(i2.a aVar, int i10) {
            this.f18606a = aVar;
            this.f18607b = i10;
        }

        public v0 a() {
            return this.f18606a.c(this.f18607b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map b(Map map, List list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            lb.w wVar = (lb.w) map.get(((i2.a) list.get(i10)).b());
            if (wVar != null && (z10 || map2.isEmpty())) {
                map2.put(wVar.f44235a, wVar);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f18594c) {
            e();
        } else if (view == this.f18595d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f18603l = false;
        this.f18598g.clear();
    }

    private void e() {
        this.f18603l = true;
        this.f18598g.clear();
    }

    private void f(View view) {
        this.f18603l = false;
        c cVar = (c) ob.a.e(view.getTag());
        ra.v vVarB = cVar.f18606a.b();
        int i10 = cVar.f18607b;
        lb.w wVar = (lb.w) this.f18598g.get(vVarB);
        if (wVar == null) {
            if (!this.f18600i && this.f18598g.size() > 0) {
                this.f18598g.clear();
            }
            this.f18598g.put(vVarB, new lb.w(vVarB, com.google.common.collect.c0.D(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(wVar.f44236b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f18606a);
        boolean z10 = zG || h();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f18598g.remove(vVarB);
                return;
            } else {
                this.f18598g.put(vVarB, new lb.w(vVarB, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f18598g.put(vVarB, new lb.w(vVarB, com.google.common.collect.c0.D(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f18598g.put(vVarB, new lb.w(vVarB, arrayList));
        }
    }

    private boolean g(i2.a aVar) {
        return this.f18599h && aVar.e();
    }

    private boolean h() {
        return this.f18600i && this.f18597f.size() > 1;
    }

    private void i() {
        this.f18594c.setChecked(this.f18603l);
        this.f18595d.setChecked(!this.f18603l && this.f18598g.size() == 0);
        for (int i10 = 0; i10 < this.f18602k.length; i10++) {
            lb.w wVar = (lb.w) this.f18598g.get(((i2.a) this.f18597f.get(i10)).b());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f18602k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (wVar != null) {
                        this.f18602k[i10][i11].setChecked(wVar.f44236b.contains(Integer.valueOf(((c) ob.a.e(checkedTextViewArr[i11].getTag())).f18607b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f18597f.isEmpty()) {
            this.f18594c.setEnabled(false);
            this.f18595d.setEnabled(false);
            return;
        }
        this.f18594c.setEnabled(true);
        this.f18595d.setEnabled(true);
        this.f18602k = new CheckedTextView[this.f18597f.size()][];
        boolean zH = h();
        for (int i10 = 0; i10 < this.f18597f.size(); i10++) {
            i2.a aVar = (i2.a) this.f18597f.get(i10);
            boolean zG = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f18602k;
            int i11 = aVar.f17053a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f17053a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator comparator = this.f18604m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f18593b.inflate(mb.o.f45478a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f18593b.inflate((zG || zH) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f18592a);
                checkedTextView.setText(this.f18601j.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.i(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f18596e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f18602k[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f18603l;
    }

    public Map<ra.v, lb.w> getOverrides() {
        return this.f18598g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f18599h != z10) {
            this.f18599h = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f18600i != z10) {
            this.f18600i = z10;
            if (!z10 && this.f18598g.size() > 1) {
                Map mapB = b(this.f18598g, this.f18597f, false);
                this.f18598g.clear();
                this.f18598g.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f18594c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(mb.w wVar) {
        this.f18601j = (mb.w) ob.a.e(wVar);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f18592a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f18593b = layoutInflaterFrom;
        b bVar = new b();
        this.f18596e = bVar;
        this.f18601j = new mb.e(getResources());
        this.f18597f = new ArrayList();
        this.f18598g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f18594c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(mb.q.f45511x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(mb.o.f45478a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f18595d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(mb.q.f45510w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
