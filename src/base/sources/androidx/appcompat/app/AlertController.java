package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final q f630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f641m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f653y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f654z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f642n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f656b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f40066m2);
            this.f656b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.f40071n2, -1);
            this.f655a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.f40076o2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f655a, getPaddingRight(), z11 ? getPaddingBottom() : this.f656b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f643o && (message3 = alertController.f645q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f647s || (message2 = alertController.f649u) == null) {
                messageObtain = (view != alertController.f651w || (message = alertController.f653y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f630b).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f659b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f661d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f664g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f665h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f666i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f667j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f668k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f669l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f670m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f671n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f672o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f673p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f674q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f676s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f677t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f678u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f679v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f680w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f681x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f682y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f683z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f660c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f662e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f675r = true;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f684a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f684a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f684a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0008b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f687b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f688c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f689d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0008b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f688c = recycleListView;
                this.f689d = alertController;
                Cursor cursor2 = getCursor();
                this.f686a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f687b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f686a));
                this.f688c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f687b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f659b.inflate(this.f689d.M, viewGroup, false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f691a;

            c(AlertController alertController) {
                this.f691a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f681x.onClick(this.f691a.f630b, i10);
                if (b.this.H) {
                    return;
                }
                this.f691a.f630b.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f693a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f694b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f693a = recycleListView;
                this.f694b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f693a.isItemChecked(i10);
                }
                b.this.J.onClick(this.f694b.f630b, i10, this.f693a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f658a = context;
            this.f659b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f659b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.H ? alertController2.N : alertController2.O;
                if (bVar.K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f658a, i10, bVar.K, new String[]{bVar.L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f680w;
                    if (dVar == null) {
                        dVar = new d(bVar.f658a, i10, R.id.text1, bVar.f679v);
                    }
                }
            } else if (this.K == null) {
                bVar = this;
                dVar = bVar.new a(this.f658a, alertController.M, R.id.text1, this.f679v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0008b(bVar.f658a, bVar.K, false, recycleListView, alertController2);
            }
            alertController2.H = dVar;
            alertController2.I = bVar.I;
            if (bVar.f681x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f635g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f664g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f663f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f661d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f660c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f662e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f665h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f666i;
            if (charSequence3 == null && this.f667j == null) {
                alertController2 = alertController;
            } else {
                alertController.k(-1, charSequence3, this.f668k, null, this.f667j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f669l;
            if (charSequence4 != null || this.f670m != null) {
                alertController2.k(-2, charSequence4, this.f671n, null, this.f670m);
            }
            CharSequence charSequence5 = this.f672o;
            if (charSequence5 != null || this.f673p != null) {
                alertController2.k(-3, charSequence5, this.f674q, null, this.f673p);
            }
            if (this.f679v != null || this.K != null || this.f680w != null) {
                b(alertController2);
            }
            View view2 = this.f683z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.s(view2);
                    return;
                }
            }
            int i12 = this.f682y;
            if (i12 != 0) {
                alertController2.r(i12);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f696a;

        public c(DialogInterface dialogInterface) {
            this.f696a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f696a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, q qVar, Window window) {
        this.f629a = context;
        this.f630b = qVar;
        this.f631c = window;
        this.R = new c(qVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.j.H, h.a.f39858k, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(h.j.I, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(h.j.K, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(h.j.M, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(h.j.N, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(h.j.P, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(h.j.L, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(h.j.O, true);
        this.f632d = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.J, 0);
        typedArrayObtainStyledAttributes.recycle();
        qVar.r(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        return this.Q == 1 ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f631c.findViewById(h.f.B);
        View viewFindViewById2 = this.f631c.findViewById(h.f.A);
        q0.z0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f643o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f644p) && this.f646r == null) {
            this.f643o.setVisibility(8);
            i10 = 0;
        } else {
            this.f643o.setText(this.f644p);
            Drawable drawable = this.f646r;
            if (drawable != null) {
                int i11 = this.f632d;
                drawable.setBounds(0, 0, i11, i11);
                this.f643o.setCompoundDrawables(this.f646r, null, null, null);
            }
            this.f643o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f647s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f648t) && this.f650v == null) {
            this.f647s.setVisibility(8);
        } else {
            this.f647s.setText(this.f648t);
            Drawable drawable2 = this.f650v;
            if (drawable2 != null) {
                int i12 = this.f632d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f647s.setCompoundDrawables(this.f650v, null, null, null);
            }
            this.f647s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f651w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f652x) && this.f654z == null) {
            this.f651w.setVisibility(8);
        } else {
            this.f651w.setText(this.f652x);
            Drawable drawable3 = this.f654z;
            if (drawable3 != null) {
                int i13 = this.f632d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f651w.setCompoundDrawables(this.f654z, null, null, null);
            }
            this.f651w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f629a)) {
            if (i10 == 1) {
                b(this.f643o);
            } else if (i10 == 2) {
                b(this.f647s);
            } else if (i10 == 4) {
                b(this.f651w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f631c.findViewById(h.f.C);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f634f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f635g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f635g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View viewInflate = this.f636h;
        if (viewInflate == null) {
            viewInflate = this.f637i != 0 ? LayoutInflater.from(this.f629a).inflate(this.f637i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f631c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f631c.findViewById(h.f.f39936o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f642n) {
            frameLayout.setPadding(this.f638j, this.f639k, this.f640l, this.f641m);
        }
        if (this.f635g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f631c.findViewById(h.f.U).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f631c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f633e) || !this.P) {
            this.f631c.findViewById(h.f.U).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f631c.findViewById(h.f.f39932k);
        this.E = textView;
        textView.setText(this.f633e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f631c.findViewById(h.f.f39947z);
        int i10 = h.f.V;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = h.f.f39935n;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = h.f.f39933l;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(h.f.f39937p);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(h.f.Q)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f634f == null && this.f635g == null) ? null : viewGroupI.findViewById(h.f.T);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(h.f.R)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f635g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f635g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                p(viewGroupI2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f635g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.f39857j, typedValue, true);
        return typedValue.data != 0;
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f651w;
        }
        if (i10 == -2) {
            return this.f647s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f643o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f629a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f635g;
    }

    public void f() {
        this.f630b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f652x = charSequence;
            this.f653y = message;
            this.f654z = drawable;
        } else if (i10 == -2) {
            this.f648t = charSequence;
            this.f649u = message;
            this.f650v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f644p = charSequence;
            this.f645q = message;
            this.f646r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f634f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f633e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f636h = null;
        this.f637i = i10;
        this.f642n = false;
    }

    public void s(View view) {
        this.f636h = view;
        this.f637i = 0;
        this.f642n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f636h = view;
        this.f637i = 0;
        this.f642n = true;
        this.f638j = i10;
        this.f639k = i11;
        this.f640l = i12;
        this.f641m = i13;
    }
}
