package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class q1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c {
        final /* synthetic */ i val$input;

        a(i iVar) {
            this.val$input = iVar;
        }

        @Override // com.google.protobuf.q1.c
        public byte byteAt(int i10) {
            return this.val$input.byteAt(i10);
        }

        @Override // com.google.protobuf.q1.c
        public int size() {
            return this.val$input.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements c {
        final /* synthetic */ byte[] val$input;

        b(byte[] bArr) {
            this.val$input = bArr;
        }

        @Override // com.google.protobuf.q1.c
        public byte byteAt(int i10) {
            return this.val$input[i10];
        }

        @Override // com.google.protobuf.q1.c
        public int size() {
            return this.val$input.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        byte byteAt(int i10);

        int size();
    }

    private q1() {
    }

    static String escapeBytes(c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte bByteAt = cVar.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb2.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String escapeText(String str) {
        return escapeBytes(i.copyFromUtf8(str));
    }

    static String escapeBytes(i iVar) {
        return escapeBytes(new a(iVar));
    }

    static String escapeBytes(byte[] bArr) {
        return escapeBytes(new b(bArr));
    }
}
