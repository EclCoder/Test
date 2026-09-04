package com.google.api.client.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PemReader {
    private static final Pattern BEGIN_PATTERN = Pattern.compile("-----BEGIN ([A-Z ]+)-----");
    private static final Pattern END_PATTERN = Pattern.compile("-----END ([A-Z ]+)-----");
    private BufferedReader reader;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Section {
        private final byte[] base64decodedBytes;
        private final String title;

        Section(String str, byte[] bArr) {
            this.title = (String) Preconditions.checkNotNull(str);
            this.base64decodedBytes = (byte[]) Preconditions.checkNotNull(bArr);
        }

        public byte[] getBase64DecodedBytes() {
            return this.base64decodedBytes;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public PemReader(Reader reader) {
        this.reader = new BufferedReader(reader);
    }

    public static Section readFirstSectionAndClose(Reader reader) {
        return readFirstSectionAndClose(reader, null);
    }

    public void close() throws IOException {
        this.reader.close();
    }

    public Section readNextSection() {
        return readNextSection(null);
    }

    public static Section readFirstSectionAndClose(Reader reader, String str) throws IOException {
        PemReader pemReader = new PemReader(reader);
        try {
            return pemReader.readNextSection(str);
        } finally {
            pemReader.close();
        }
    }

    public Section readNextSection(String str) throws IOException {
        StringBuilder sb2 = null;
        String str2 = null;
        while (true) {
            String line = this.reader.readLine();
            if (line == null) {
                Preconditions.checkArgument(str2 == null, "missing end tag (%s)", str2);
                return null;
            }
            if (sb2 == null) {
                Matcher matcher = BEGIN_PATTERN.matcher(line);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (str == null || strGroup.equals(str)) {
                        sb2 = new StringBuilder();
                        str2 = strGroup;
                    }
                }
            } else {
                Matcher matcher2 = END_PATTERN.matcher(line);
                if (matcher2.matches()) {
                    String strGroup2 = matcher2.group(1);
                    Preconditions.checkArgument(strGroup2.equals(str2), "end tag (%s) doesn't match begin tag (%s)", strGroup2, str2);
                    return new Section(str2, Base64.decodeBase64(sb2.toString()));
                }
                sb2.append(line);
            }
        }
    }
}
