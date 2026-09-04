package com.bytedance.adsdk.hnj.hn.sk;

import com.bytedance.adsdk.hnj.hn.gjv.gjv;
import com.bytedance.adsdk.hnj.hn.gjv.qor;
import com.bytedance.adsdk.hnj.hn.hn.hnj.aq;
import com.bytedance.adsdk.hnj.hn.hn.hnj.bug;
import com.bytedance.adsdk.hnj.hn.hn.hnj.dkl;
import com.bytedance.adsdk.hnj.hn.hn.hnj.dnm;
import com.bytedance.adsdk.hnj.hn.hn.hnj.mjg;
import com.bytedance.adsdk.hnj.hn.hn.hnj.oj;
import com.bytedance.adsdk.hnj.hn.hn.hnj.ojm;
import com.bytedance.adsdk.hnj.hn.hn.hnj.orl;
import com.bytedance.adsdk.hnj.hn.hn.hnj.sk;
import com.bytedance.adsdk.hnj.hn.hn.hnj.uua;
import com.bytedance.adsdk.hnj.hn.hn.hnj.xn;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {

    /* JADX INFO: renamed from: com.bytedance.adsdk.hnj.hn.sk.hn$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[qor.values().length];
            hnj = iArr;
            try {
                iArr[qor.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[qor.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[qor.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hnj[qor.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hnj[qor.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hnj[qor.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                hnj[qor.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                hnj[qor.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                hnj[qor.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                hnj[qor.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                hnj[qor.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                hnj[qor.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                hnj[qor.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> hn(List<com.bytedance.adsdk.hnj.hn.hn.hnj> list, String str, int i10) {
        LinkedList<com.bytedance.adsdk.hnj.hn.hn.hnj> linkedList = new LinkedList(list);
        int i11 = 5;
        while (i11 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar : linkedList) {
                if (!linkedList2.isEmpty() && qor.hnj(((com.bytedance.adsdk.hnj.hn.hn.hnj) linkedList2.peekLast()).hnj()) && ((qor) ((com.bytedance.adsdk.hnj.hn.hn.hnj) linkedList2.peekLast()).hnj()).hn() == i11) {
                    com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar2 = (com.bytedance.adsdk.hnj.hn.hn.hnj) linkedList2.pollLast();
                    com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar3 = (com.bytedance.adsdk.hnj.hn.hn.hnj) linkedList2.pollLast();
                    if (qor.hnj(hnjVar3.hnj()) || qor.hnj(hnjVar.hnj())) {
                        throw new IllegalArgumentException(str.substring(0, i10));
                    }
                    linkedList2.addLast(hnj(hnjVar3, hnjVar2, hnjVar));
                } else {
                    linkedList2.addLast(hnjVar);
                }
            }
            i11--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static com.bytedance.adsdk.hnj.hn.hn.hnj hnj(List<com.bytedance.adsdk.hnj.hn.hn.hnj> list, String str, int i10) {
        qor(list, str, i10);
        Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> dequeHnj = hnj(hn(list, str, i10));
        if (dequeHnj.size() == 1) {
            return dequeHnj.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void qor(List<com.bytedance.adsdk.hnj.hn.hn.hnj> list, String str, int i10) {
        Iterator<com.bytedance.adsdk.hnj.hn.hn.hnj> it = list.iterator();
        while (it.hasNext()) {
            if (gjv.hnj(it.next().hnj())) {
                throw new IllegalArgumentException(str.substring(0, i10));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> hnj(Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.hnj.hn.hn.hnj) linkedList.peekLast()).hnj() == qor.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar2 = (com.bytedance.adsdk.hnj.hn.hn.hnj) linkedList.pollLast();
                if (((com.bytedance.adsdk.hnj.hn.hn.hnj) linkedList.pollLast()).hnj() == qor.QUESTION) {
                    com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar3 = (com.bytedance.adsdk.hnj.hn.hn.hnj) linkedList.pollLast();
                    xn xnVar = new xn();
                    xnVar.hnj(hnjVar3);
                    xnVar.hn(hnjVar2);
                    xnVar.qor(hnjVar);
                    linkedList.addLast(xnVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(hnjVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.hnj.hn.hn.hnj hnj(com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar, com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar2, com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar3) {
        uua dnmVar;
        switch (AnonymousClass1.hnj[((qor) hnjVar2.hnj()).ordinal()]) {
            case 1:
                dnmVar = new dnm();
                break;
            case 2:
                dnmVar = new oj();
                break;
            case 3:
                dnmVar = new com.bytedance.adsdk.hnj.hn.hn.hnj.hnj();
                break;
            case 4:
                dnmVar = new orl();
                break;
            case 5:
                dnmVar = new bug();
                break;
            case 6:
                dnmVar = new com.bytedance.adsdk.hnj.hn.hn.hnj.gjv();
                break;
            case 7:
                dnmVar = new mjg();
                break;
            case 8:
                dnmVar = new dkl();
                break;
            case 9:
                dnmVar = new ojm();
                break;
            case 10:
                dnmVar = new sk();
                break;
            case 11:
                dnmVar = new aq();
                break;
            case 12:
                dnmVar = new com.bytedance.adsdk.hnj.hn.hn.hnj.hn();
                break;
            case 13:
                dnmVar = new com.bytedance.adsdk.hnj.hn.hn.hnj.qor();
                break;
            default:
                throw new UnsupportedOperationException(hnjVar2.hnj().toString());
        }
        dnmVar.hnj(hnjVar);
        dnmVar.hn(hnjVar3);
        return dnmVar;
    }

    public static boolean hnj(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
