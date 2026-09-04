package o0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import ta.QXA.YSHErhbVu;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f47920d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f47921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47922b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47923c = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class a {
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f47946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f47947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f47948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final s f47949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f47924e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f47925f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f47926g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f47927h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f47928i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f47929j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f47930k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f47931l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f47932m = new a(256, (CharSequence) null, s.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f47933n = new a(512, (CharSequence) null, s.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f47934o = new a(UserVerificationMethods.USER_VERIFY_ALL, (CharSequence) null, s.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f47935p = new a(2048, (CharSequence) null, s.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f47936q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f47937r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f47938s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f47939t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f47940u = new a(C.DEFAULT_BUFFER_SEGMENT_SIZE, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f47941v = new a(131072, (CharSequence) null, s.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f47942w = new a(MediaHttpUploader.MINIMUM_CHUNK_SIZE, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f47943x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f47944y = new a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f47945z = new a(2097152, (CharSequence) null, s.h.class);
        public static final a A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        public static final a B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, s.e.class);
        public static final a C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        public static final a D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        public static final a E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        public static final a F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);

        static {
            int i10 = Build.VERSION.SDK_INT;
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, s.f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, s.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
            W = new a(j0.c.a() ? f.a() : null, R.id.ALT, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, s sVar) {
            return new a(null, this.f47947b, charSequence, sVar, this.f47948c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f47946a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f47946a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f47949d == null) {
                return false;
            }
            Class cls = this.f47948c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f47948c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f47949d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f47946a;
            if (obj2 == null) {
                return aVar.f47946a == null;
            }
            return obj2.equals(aVar.f47946a);
        }

        public int hashCode() {
            Object obj = this.f47946a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strJ = p.j(this.f47947b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb2.append(strJ);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, s sVar) {
            this(null, i10, charSequence, sVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, s sVar, Class cls) {
            this.f47947b = i10;
            this.f47949d = sVar;
            if (obj == null) {
                this.f47946a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f47946a = obj;
            }
            this.f47948c = cls;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class f {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f47950a;

        g(Object obj) {
            this.f47950a = obj;
        }

        public static g a(int i10, int i11, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static g b(int i10, int i11, boolean z10, int i12) {
            return new g(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f47951a;

        h(Object obj) {
            this.f47951a = obj;
        }

        public static h a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f47952a;

        i(Object obj) {
            this.f47952a = obj;
        }

        public static i a(int i10, float f10, float f11, float f12) {
            return new i(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }
    }

    private p(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f47921a = accessibilityNodeInfo;
    }

    private SparseArray C(View view) {
        SparseArray sparseArrayE = E(view);
        if (sparseArrayE != null) {
            return sparseArrayE;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(b0.c.I, sparseArray);
        return sparseArray;
    }

    private SparseArray E(View view) {
        return (SparseArray) view.getTag(b0.c.I);
    }

    private boolean L() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int M(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f47920d;
        f47920d = i11 + 1;
        return i11;
    }

    public static p c1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new p(accessibilityNodeInfo);
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void g() {
        this.f47921a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f47921a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f47921a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f47921a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public static p g0() {
        return c1(AccessibilityNodeInfo.obtain());
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f47921a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f47921a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static p h0(View view) {
        return c1(AccessibilityNodeInfo.obtain(view));
    }

    public static p i0(p pVar) {
        return c1(AccessibilityNodeInfo.obtain(pVar.f47921a));
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case UserVerificationMethods.USER_VERIFY_ALL /* 1024 */:
                return WwUgngZLNA.eGH;
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case MediaHttpUploader.MINIMUM_CHUNK_SIZE /* 262144 */:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i10) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    private boolean l(int i10) {
        Bundle bundleZ = z();
        return bundleZ != null && (bundleZ.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    private void m0(View view) {
        SparseArray sparseArrayE = E(view);
        if (sparseArrayE != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayE.size(); i10++) {
                if (((WeakReference) sparseArrayE.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayE.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void o0(int i10, boolean z10) {
        Bundle bundleZ = z();
        if (bundleZ != null) {
            int i11 = bundleZ.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleZ.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private String q() {
        int iP = p();
        if (iP == 1) {
            return "TRUE";
        }
        return iP == 2 ? "PARTIAL" : "FALSE";
    }

    public static ClickableSpan[] t(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    static String y(int i10) {
        if (i10 == 0) {
            return "UNDEFINED";
        }
        if (i10 == 1) {
            return "COLLAPSED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "UNKNOWN" : "FULL";
        }
        return "PARTIAL";
    }

    public int A() {
        return this.f47921a.getMaxTextLength();
    }

    public void A0(boolean z10) {
        this.f47921a.setEnabled(z10);
    }

    public int B() {
        return this.f47921a.getMovementGranularities();
    }

    public void B0(CharSequence charSequence) {
        this.f47921a.setError(charSequence);
    }

    public void C0(boolean z10) {
        this.f47921a.setFocusable(z10);
    }

    public CharSequence D() {
        return this.f47921a.getPackageName();
    }

    public void D0(boolean z10) {
        this.f47921a.setFocused(z10);
    }

    public void E0(boolean z10) {
        o0(67108864, z10);
    }

    public CharSequence F() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f47921a) : this.f47921a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void F0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f47921a.setHeading(z10);
        } else {
            o0(2, z10);
        }
    }

    public CharSequence G() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f47921a) : this.f47921a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void G0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f47921a.setHintText(charSequence);
        } else {
            this.f47921a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence H() {
        if (!L()) {
            return this.f47921a.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f47921a.getText(), 0, this.f47921a.getText().length()));
        for (int i10 = 0; i10 < listH.size(); i10++) {
            spannableString.setSpan(new o0.a(((Integer) listH4.get(i10)).intValue(), this, z().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i10)).intValue(), ((Integer) listH2.get(i10)).intValue(), ((Integer) listH3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void H0(View view) {
        this.f47921a.setLabelFor(view);
    }

    public CharSequence I() {
        return Build.VERSION.SDK_INT >= 28 ? this.f47921a.getTooltipText() : this.f47921a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void I0(boolean z10) {
        this.f47921a.setLongClickable(z10);
    }

    public String J() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f47921a) : this.f47921a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void J0(int i10) {
        this.f47921a.setMaxTextLength(i10);
    }

    public String K() {
        return this.f47921a.getViewIdResourceName();
    }

    public void K0(int i10) {
        this.f47921a.setMovementGranularities(i10);
    }

    public void L0(CharSequence charSequence) {
        this.f47921a.setPackageName(charSequence);
    }

    public void M0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f47921a.setPaneTitle(charSequence);
        } else {
            this.f47921a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean N() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f47921a) : l(64);
    }

    public void N0(View view) {
        this.f47922b = -1;
        this.f47921a.setParent(view);
    }

    public boolean O() {
        return this.f47921a.isAccessibilityFocused();
    }

    public void O0(View view, int i10) {
        this.f47922b = i10;
        this.f47921a.setParent(view, i10);
    }

    public boolean P() {
        return this.f47921a.isCheckable();
    }

    public void P0(i iVar) {
        this.f47921a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) iVar.f47952a);
    }

    public boolean Q() {
        return this.f47921a.isChecked();
    }

    public void Q0(CharSequence charSequence) {
        this.f47921a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean R() {
        return this.f47921a.isClickable();
    }

    public void R0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f47921a.setScreenReaderFocusable(z10);
        } else {
            o0(1, z10);
        }
    }

    public boolean S() {
        return this.f47921a.isContextClickable();
    }

    public void S0(boolean z10) {
        this.f47921a.setScrollable(z10);
    }

    public boolean T() {
        return this.f47921a.isEnabled();
    }

    public void T0(boolean z10) {
        this.f47921a.setSelected(z10);
    }

    public boolean U() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f47921a) : this.f47921a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void U0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f47921a.setShowingHintText(z10);
        } else {
            o0(4, z10);
        }
    }

    public boolean V() {
        return this.f47921a.isFocusable();
    }

    public void V0(View view) {
        this.f47923c = -1;
        this.f47921a.setSource(view);
    }

    public boolean W() {
        return this.f47921a.isFocused();
    }

    public void W0(View view, int i10) {
        this.f47923c = i10;
        this.f47921a.setSource(view, i10);
    }

    public boolean X() {
        return l(67108864);
    }

    public void X0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f47921a, charSequence);
        } else {
            this.f47921a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean Y() {
        return this.f47921a.isImportantForAccessibility();
    }

    public void Y0(CharSequence charSequence) {
        this.f47921a.setText(charSequence);
    }

    public boolean Z() {
        return this.f47921a.isLongClickable();
    }

    public void Z0(View view) {
        this.f47921a.setTraversalAfter(view);
    }

    public void a(int i10) {
        this.f47921a.addAction(i10);
    }

    public boolean a0() {
        return this.f47921a.isPassword();
    }

    public void a1(boolean z10) {
        this.f47921a.setVisibleToUser(z10);
    }

    public void b(a aVar) {
        this.f47921a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f47946a);
    }

    public boolean b0() {
        return this.f47921a.isScrollable();
    }

    public AccessibilityNodeInfo b1() {
        return this.f47921a;
    }

    public void c(View view) {
        this.f47921a.addChild(view);
    }

    public boolean c0() {
        return this.f47921a.isSelected();
    }

    public void d(View view, int i10) {
        this.f47921a.addChild(view, i10);
    }

    public boolean d0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f47921a.isShowingHintText() : l(4);
    }

    public boolean e0() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f47921a) : l(8388608);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f47921a;
        if (accessibilityNodeInfo == null) {
            if (pVar.f47921a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(pVar.f47921a)) {
            return false;
        }
        return this.f47923c == pVar.f47923c && this.f47922b == pVar.f47922b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            m0(view);
            ClickableSpan[] clickableSpanArrT = t(charSequence);
            if (clickableSpanArrT == null || clickableSpanArrT.length <= 0) {
                return;
            }
            z().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", b0.c.f8206a);
            SparseArray sparseArrayC = C(view);
            for (int i10 = 0; i10 < clickableSpanArrT.length; i10++) {
                int iM = M(clickableSpanArrT[i10], sparseArrayC);
                sparseArrayC.put(iM, new WeakReference(clickableSpanArrT[i10]));
                e(clickableSpanArrT[i10], (Spanned) charSequence, iM);
            }
        }
    }

    public boolean f0() {
        return this.f47921a.isVisibleToUser();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f47921a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f47921a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean j0(int i10, Bundle bundle) {
        return this.f47921a.performAction(i10, bundle);
    }

    public int k() {
        return this.f47921a.getActions();
    }

    public void k0() {
    }

    public boolean l0(a aVar) {
        return this.f47921a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f47946a);
    }

    public void m(Rect rect) {
        this.f47921a.getBoundsInParent(rect);
    }

    public void n(Rect rect) {
        this.f47921a.getBoundsInScreen(rect);
    }

    public void n0(boolean z10) {
        this.f47921a.setAccessibilityFocused(z10);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f47921a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f47921a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public int p() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f47921a) : this.f47921a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f47921a.isChecked() ? 1 : 0);
    }

    public void p0(Rect rect) {
        this.f47921a.setBoundsInParent(rect);
    }

    public void q0(Rect rect) {
        this.f47921a.setBoundsInScreen(rect);
    }

    public int r() {
        return this.f47921a.getChildCount();
    }

    public void r0(boolean z10) {
        this.f47921a.setCanOpenPopup(z10);
    }

    public CharSequence s() {
        return this.f47921a.getClassName();
    }

    public void s0(boolean z10) {
        this.f47921a.setCheckable(z10);
    }

    public void t0(boolean z10) {
        this.f47921a.setChecked(z10);
    }

    public CharSequence u() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f47921a) : this.f47921a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void u0(CharSequence charSequence) {
        this.f47921a.setClassName(charSequence);
    }

    public CharSequence v() {
        return this.f47921a.getContentDescription();
    }

    public void v0(boolean z10) {
        this.f47921a.setClickable(z10);
    }

    public CharSequence w() {
        return this.f47921a.getError();
    }

    public void w0(Object obj) {
        this.f47921a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((g) obj).f47950a);
    }

    public int x() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f47921a) : this.f47921a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void x0(Object obj) {
        this.f47921a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((h) obj).f47951a);
    }

    public void y0(CharSequence charSequence) {
        this.f47921a.setContentDescription(charSequence);
    }

    public Bundle z() {
        return this.f47921a.getExtras();
    }

    public void z0(boolean z10) {
        this.f47921a.setDismissable(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(D());
        sb2.append("; className: ");
        sb2.append(s());
        sb2.append("; text: ");
        sb2.append(H());
        sb2.append("; error: ");
        sb2.append(w());
        sb2.append("; maxTextLength: ");
        sb2.append(A());
        sb2.append("; stateDescription: ");
        sb2.append(F());
        sb2.append("; contentDescription: ");
        sb2.append(v());
        sb2.append("; supplementalDescription: ");
        sb2.append(G());
        sb2.append("; tooltipText: ");
        sb2.append(I());
        sb2.append("; viewIdResName: ");
        sb2.append(K());
        sb2.append("; uniqueId: ");
        sb2.append(J());
        sb2.append("; checkable: ");
        sb2.append(P());
        sb2.append("; checked: ");
        sb2.append(q());
        sb2.append("; fieldRequired: ");
        sb2.append(U());
        sb2.append("; focusable: ");
        sb2.append(V());
        sb2.append("; focused: ");
        sb2.append(W());
        sb2.append("; selected: ");
        sb2.append(c0());
        sb2.append("; clickable: ");
        sb2.append(R());
        sb2.append("; longClickable: ");
        sb2.append(Z());
        sb2.append("; contextClickable: ");
        sb2.append(S());
        sb2.append("; expandedState: ");
        sb2.append(y(x()));
        sb2.append("; enabled: ");
        sb2.append(T());
        sb2.append("; password: ");
        sb2.append(a0());
        sb2.append("; scrollable: " + b0());
        sb2.append(YSHErhbVu.PtIVwseYlsbGGm);
        sb2.append(u());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(X());
        sb2.append("; importantForAccessibility: ");
        sb2.append(Y());
        sb2.append("; visible: ");
        sb2.append(f0());
        sb2.append("; isTextSelectable: ");
        sb2.append(e0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(N());
        sb2.append("; [");
        List listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = (a) listI.get(i10);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb2.append(strJ);
            if (i10 != listI.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
