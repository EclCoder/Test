package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.emoji2.text.e.j f3874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f3875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.emoji2.text.e.InterfaceC0037e f3876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f3878e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f3879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.emoji2.text.e.j f3880b;

        b(q qVar, androidx.emoji2.text.e.j jVar) {
            this.f3879a = qVar;
            this.f3880b = jVar;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean a(CharSequence charSequence, int i10, int i11, o oVar) {
            if (oVar.k()) {
                return true;
            }
            if (this.f3879a == null) {
                this.f3879a = new q(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f3879a.setSpan(this.f3880b.a(oVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q getResult() {
            return this.f3879a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        boolean a(CharSequence charSequence, int i10, int i11, o oVar);

        Object getResult();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3882a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m.a f3883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.a f3884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m.a f3885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f3888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f3889h;

        e(m.a aVar, boolean z10, int[] iArr) {
            this.f3883b = aVar;
            this.f3884c = aVar;
            this.f3888g = z10;
            this.f3889h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f3882a = 1;
            this.f3884c = this.f3883b;
            this.f3887f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f3884c.b().j() || d(this.f3886e)) {
                return true;
            }
            if (this.f3888g) {
                if (this.f3889h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3889h, this.f3884c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            m.a aVarA = this.f3884c.a(i10);
            int iG = 2;
            if (this.f3882a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f3882a = 2;
                    this.f3884c = aVarA;
                    this.f3887f = 1;
                }
            } else if (aVarA != null) {
                this.f3884c = aVarA;
                this.f3887f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f3884c.b() != null) {
                    iG = 3;
                    if (this.f3887f != 1 || h()) {
                        this.f3885d = this.f3884c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f3886e = i10;
            return iG;
        }

        o b() {
            return this.f3884c.b();
        }

        o c() {
            return this.f3885d.b();
        }

        boolean e() {
            if (this.f3882a != 2 || this.f3884c.b() == null) {
                return false;
            }
            return this.f3887f > 1 || h();
        }
    }

    h(m mVar, androidx.emoji2.text.e.j jVar, androidx.emoji2.text.e.InterfaceC0037e interfaceC0037e, boolean z10, int[] iArr, Set set) {
        this.f3874a = jVar;
        this.f3875b = mVar;
        this.f3876c = interfaceC0037e;
        this.f3877d = z10;
        this.f3878e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        i[] iVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(iMax, iMin, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i10, KeyEvent keyEvent) {
        boolean zA;
        if (i10 != 67) {
            zA = i10 != 112 ? false : a(editable, keyEvent, true);
        } else {
            zA = a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i10, int i11, o oVar) {
        if (oVar.d() == 0) {
            oVar.m(this.f3876c.a(charSequence, i10, i11, oVar.h()));
        }
        return oVar.d() == 2;
    }

    private static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private Object i(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c cVar) {
        int iCharCount;
        e eVar = new e(this.f3875b.f(), this.f3877d, this.f3878e);
        int i13 = 0;
        boolean zA = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (true) {
                if (i10 >= i11 || i13 >= i12 || !zA) {
                    break loop0;
                }
                int iA = eVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA != 3) {
                }
            }
            if (z10 || !d(charSequence, iCharCount, i10, eVar.c())) {
                zA = cVar.a(charSequence, iCharCount, i10, eVar.c());
                i13++;
            }
        }
        if (eVar.e() && i13 < i12 && zA && (z10 || !d(charSequence, iCharCount, i10, eVar.b()))) {
            cVar.a(charSequence, iCharCount, i10, eVar.b());
        }
        return cVar.getResult();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    CharSequence h(CharSequence charSequence, int i10, int i11, int i12, boolean z10) throws Throwable {
        q qVar;
        CharSequence charSequence2;
        Throwable th2;
        int i13;
        int i14;
        n nVar;
        i[] iVarArr;
        int i15;
        int spanStart;
        boolean z11 = charSequence instanceof n;
        if (z11) {
            ((n) charSequence).a();
        }
        if (z11) {
            qVar = new q((Spannable) charSequence);
            if (qVar != null) {
                for (i iVar : iVarArr) {
                    spanStart = qVar.getSpanStart(iVar);
                    int spanEnd = qVar.getSpanEnd(iVar);
                    if (spanStart != i11) {
                        qVar.removeSpan(iVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
                nVar = (n) charSequence2;
                nVar.d();
            } else {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
                nVar = (n) charSequence2;
                nVar.d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    qVar = new q((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((n) charSequence2).d();
                    throw th2;
                }
            } else {
                qVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, i.class) > i11) ? null : new q(charSequence);
            }
            if (qVar != null && (iVarArr = (i[]) qVar.getSpans(i10, i11, i.class)) != null && iVarArr.length > 0) {
                while (i15 < r5) {
                    spanStart = qVar.getSpanStart(iVar);
                    int spanEnd2 = qVar.getSpanEnd(iVar);
                    if (spanStart != i11) {
                        qVar.removeSpan(iVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14 && i13 < charSequence.length()) {
                if (i12 != Integer.MAX_VALUE && qVar != null) {
                    i12 -= ((i[]) qVar.getSpans(0, qVar.length(), i.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    q qVar2 = (q) i(charSequence2, i13, i14, i12, z10, new b(qVar, this.f3874a));
                    if (qVar2 == null) {
                        if (z11) {
                            nVar = (n) charSequence2;
                        }
                        return charSequence2;
                    }
                    Spannable spannableB = qVar2.b();
                    if (z11) {
                        ((n) charSequence2).d();
                    }
                    return spannableB;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((n) charSequence2).d();
                    throw th2;
                }
            }
            charSequence2 = charSequence;
            if (!z11) {
                return charSequence2;
            }
            nVar = (n) charSequence2;
            nVar.d();
            return charSequence2;
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th2;
        }
        ((n) charSequence2).d();
        throw th2;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3881a;

        d(String str) {
            this.f3881a = str;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean a(CharSequence charSequence, int i10, int i11, o oVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f3881a)) {
                return true;
            }
            oVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }
    }
}
