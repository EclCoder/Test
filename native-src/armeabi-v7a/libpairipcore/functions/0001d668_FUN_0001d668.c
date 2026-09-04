/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001d668
 * Address  : 0001d668
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int * FUN_0001d668(undefined8 *param_1)

{
  byte *pbVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  char *pcVar5;
  size_t sVar6;
  byte *pbVar7;
  char *pcVar8;
  undefined *puVar9;
  uint uVar10;
  char *pcVar11;
  char *pcVar12;
  bool bVar13;
  bool bVar14;
  undefined8 uVar15;
  int local_24;
  int iStack_20;
  int local_1c;
  
  pbVar7 = *(byte **)param_1;
  pbVar1 = *(byte **)((int)param_1 + 4);
  if (pbVar1 == pbVar7) {
    uVar10 = 0xffffffb6;
  }
  else {
    uVar10 = *pbVar7 - 0x4a;
  }
  switch(uVar10 >> 1 | uVar10 << 0x1f) {
  case 0:
    iVar3 = *(int *)((int)param_1 + 0xc);
    iVar2 = *(int *)(param_1 + 1);
    pbVar7 = pbVar7 + 1;
    *(byte **)param_1 = pbVar7;
    while ((pbVar7 == pbVar1 || (*pbVar7 != 0x45))) {
      local_1c = FUN_0001d668(param_1);
      if (local_1c == 0) {
        return (int *)0x0;
      }
      FUN_0001d7c0(param_1 + 1,&local_1c);
      pbVar1 = *(byte **)((int)param_1 + 4);
      pbVar7 = *(byte **)param_1;
    }
    *(byte **)param_1 = pbVar7 + 1;
    FUN_0001d830(&local_24,param_1,iVar3 - iVar2 >> 2);
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x29;
    *piVar4 = DAT_0001d7b8 + 0x1d79c;
    piVar4[2] = local_24;
    piVar4[3] = iStack_20;
    goto LAB_0001d79e;
  case 1:
    if ((1 < (uint)((int)pbVar1 - (int)pbVar7)) && (pbVar7[1] == 0x5a)) {
      *(byte **)param_1 = pbVar7 + 2;
      piVar4 = (int *)FUN_0001bef4(param_1);
      goto LAB_0001d744;
    }
    pcVar5 = *(char **)param_1;
    pcVar8 = *(char **)((int)param_1 + 4);
    if (pcVar5 == pcVar8) {
      return (int *)0x0;
    }
    if (*pcVar5 != 'L') {
      return (int *)0x0;
    }
    pcVar11 = pcVar5 + 1;
    *(char **)param_1 = pcVar11;
    if (pcVar8 == pcVar11) {
LAB_0001fcb6:
      iVar2 = FUN_0001c660(param_1);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      uVar15 = FUN_0001c5c0(&iStack_20,param_1,1);
      if (local_1c != 0) {
        uVar15 = *param_1;
      }
      pcVar5 = (char *)uVar15;
      if (local_1c == 0 || pcVar5 == (char *)((ulonglong)uVar15 >> 0x20)) {
        return (int *)0x0;
      }
      if (*pcVar5 != 'E') {
        return (int *)0x0;
      }
      *(char **)param_1 = pcVar5 + 1;
      piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x14);
      *(undefined1 *)(piVar4 + 1) = 0x4c;
      iVar3 = DAT_00020074;
      piVar4[4] = local_1c;
      *piVar4 = iVar3 + 0x1fd14;
      piVar4[2] = iVar2;
      piVar4[3] = iStack_20;
      goto LAB_00020000;
    }
    break;
  default:
switchD_0001d68c_caseD_2:
    piVar4 = (int *)FUN_0001c660(param_1);
    return piVar4;
  case 5:
    iVar2 = FUN_00020f70(param_1);
    if (iVar2 == 0) goto switchD_0001d68c_caseD_2;
    iVar2 = FUN_00020fb0(param_1,0);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    iVar3 = FUN_0001d668(param_1);
    if (iVar3 == 0) {
      return (int *)0x0;
    }
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x22;
    piVar4[2] = iVar2;
    piVar4[3] = iVar3;
    *piVar4 = DAT_0001d7bc + 0x1d716;
LAB_0001d79e:
    *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
    return piVar4;
  case 7:
    *(byte **)param_1 = pbVar7 + 1;
    piVar4 = (int *)FUN_0001eb18(param_1);
LAB_0001d744:
    if (((piVar4 != (int *)0x0) &&
        (pcVar5 = *(char **)param_1, pcVar5 != *(char **)((int)param_1 + 4))) && (*pcVar5 == 'E')) {
      *(char **)param_1 = pcVar5 + 1;
      return piVar4;
    }
    return (int *)0x0;
  }
  piVar4 = (int *)0x0;
  switch(*pcVar11) {
  case 'A':
    iVar2 = FUN_0001c660(param_1);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    pcVar5 = *(char **)param_1;
    if (pcVar5 == *(char **)((int)param_1 + 4)) {
      return (int *)0x0;
    }
    if (*pcVar5 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 1;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0xc);
    *(undefined1 *)(piVar4 + 1) = 0x4a;
    piVar4[2] = iVar2;
    puVar9 = (undefined *)(_UNK_00020014 + 0x1fcb6);
    goto code_r0x0001fffc;
  default:
    goto LAB_0001fcb6;
  case 'D':
    iVar2 = FUN_0001bec0(param_1,&UNK_0001fd6e + _UNK_00020068,2);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    pcVar5 = *(char **)param_1;
    if ((pcVar5 != *(char **)((int)param_1 + 4)) && (*pcVar5 == '0')) {
      pcVar5 = pcVar5 + 1;
      *(char **)param_1 = pcVar5;
    }
    if (pcVar5 != *(char **)((int)param_1 + 4)) {
      if (*pcVar5 == 'E') {
        *(char **)param_1 = pcVar5 + 1;
        pcVar5 = &UNK_0001fd9c + _UNK_0002006c;
        piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
        sVar6 = strlen(pcVar5);
        piVar4[2] = (int)pcVar5;
        piVar4[3] = sVar6;
        *(undefined1 *)(piVar4 + 1) = 8;
        *piVar4 = DAT_00020988 + 0x2097a;
        *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
        return piVar4;
      }
      return (int *)0x0;
    }
    return (int *)0x0;
  case 'T':
    goto LAB_0001fcde;
  case 'U':
    if ((uint)((int)pcVar8 - (int)pcVar11) < 2) {
      return (int *)0x0;
    }
    if (pcVar5[2] != 'l') {
      return (int *)0x0;
    }
    iVar2 = FUN_0002098c(param_1,0);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    pcVar5 = *(char **)param_1;
    if (pcVar5 == *(char **)((int)param_1 + 4)) {
      return (int *)0x0;
    }
    if (*pcVar5 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 1;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0xc);
    *(undefined1 *)(piVar4 + 1) = 0x4b;
    piVar4[2] = iVar2;
    puVar9 = &UNK_0001fe70 + _UNK_00020070;
    goto code_r0x0001fffc;
  case '_':
    iVar2 = FUN_0001bec0(param_1,&UNK_0001fdb2 + _UNK_00020064,2);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    piVar4 = (int *)FUN_0001bef4(param_1);
    if (piVar4 == (int *)0x0) {
      return (int *)0x0;
    }
    pcVar5 = *(char **)param_1;
    if (pcVar5 == *(char **)((int)param_1 + 4)) {
      return (int *)0x0;
    }
    if (*pcVar5 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 1;
    return piVar4;
  case 'a':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0xb;
    puVar9 = &UNK_0001fe16 + _UNK_00020028;
    break;
  case 'b':
    iVar2 = FUN_0001bec0(param_1,&UNK_0001fe7a + _UNK_0002001c,3);
    if (iVar2 == 0) {
      iVar2 = FUN_0001bec0(param_1,&UNK_0001ff4a + _UNK_00020020,3);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      iStack_20 = 1;
    }
    else {
      iStack_20 = 0;
    }
    piVar4 = (int *)func_0x00020910(param_1,&iStack_20);
    return piVar4;
  case 'c':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 4;
    puVar9 = &UNK_0001fe92 + _UNK_00020024;
    break;
  case 'd':
    pcVar11 = pcVar5 + 2;
    *(char **)param_1 = pcVar11;
    if ((uint)((int)pcVar8 - (int)pcVar11) < 0x11) {
      return (int *)0x0;
    }
    pcVar12 = pcVar5 + 0x12;
    for (iVar2 = 0; iVar2 != 0x10; iVar2 = iVar2 + 1) {
      uVar10 = (byte)pcVar11[iVar2] - 0x30;
      bVar14 = 9 < uVar10;
      bVar13 = uVar10 == 10;
      if (bVar14) {
        uVar10 = (byte)pcVar11[iVar2] - 0x61;
        bVar13 = uVar10 == 5;
      }
      if ((bVar14 && 4 < uVar10) && !bVar13) {
        return (int *)0x0;
      }
    }
    *(char **)param_1 = pcVar12;
    if (pcVar12 == pcVar8) {
      return (int *)0x0;
    }
    if (*pcVar12 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 0x13;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x4f;
    piVar4[2] = (int)pcVar11;
    piVar4[3] = 0x10;
    puVar9 = (undefined *)(_UNK_0002005c + 0x1fffe);
    goto code_r0x0001fffc;
  case 'e':
    pcVar11 = pcVar5 + 2;
    *(char **)param_1 = pcVar11;
    if ((uint)((int)pcVar8 - (int)pcVar11) < 0x11) {
      return (int *)0x0;
    }
    pcVar12 = pcVar5 + 0x12;
    for (iVar2 = 0; iVar2 != 0x10; iVar2 = iVar2 + 1) {
      uVar10 = (byte)pcVar11[iVar2] - 0x30;
      bVar14 = 9 < uVar10;
      bVar13 = uVar10 == 10;
      if (bVar14) {
        uVar10 = (byte)pcVar11[iVar2] - 0x61;
        bVar13 = uVar10 == 5;
      }
      if ((bVar14 && 4 < uVar10) && !bVar13) {
        return (int *)0x0;
      }
    }
    *(char **)param_1 = pcVar12;
    if (pcVar12 == pcVar8) {
      return (int *)0x0;
    }
    if (*pcVar12 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 0x13;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x50;
    piVar4[2] = (int)pcVar11;
    piVar4[3] = 0x10;
    puVar9 = &UNK_0001ffca + _UNK_00020060;
    goto code_r0x0001fffc;
  case 'f':
    pcVar11 = pcVar5 + 2;
    *(char **)param_1 = pcVar11;
    if ((uint)((int)pcVar8 - (int)pcVar11) < 9) {
      return (int *)0x0;
    }
    pcVar12 = pcVar5 + 10;
    for (iVar2 = 0; iVar2 != 8; iVar2 = iVar2 + 1) {
      uVar10 = (byte)pcVar11[iVar2] - 0x30;
      bVar14 = 9 < uVar10;
      bVar13 = uVar10 == 10;
      if (bVar14) {
        uVar10 = (byte)pcVar11[iVar2] - 0x61;
        bVar13 = uVar10 == 5;
      }
      if ((bVar14 && 4 < uVar10) && !bVar13) {
        return (int *)0x0;
      }
    }
    *(char **)param_1 = pcVar12;
    if (pcVar12 == pcVar8) {
      return (int *)0x0;
    }
    if (*pcVar12 != 'E') {
      return (int *)0x0;
    }
    *(char **)param_1 = pcVar5 + 0xb;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x4e;
    piVar4[2] = (int)pcVar11;
    piVar4[3] = 8;
    puVar9 = &UNK_0001ff96 + _UNK_00020058;
code_r0x0001fffc:
    *piVar4 = (int)(puVar9 + 8);
LAB_00020000:
    *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
LAB_0001fcde:
    return piVar4;
  case 'h':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0xd;
    puVar9 = &UNK_0001fe24 + _UNK_0002002c;
    break;
  case 'i':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0;
    puVar9 = &UNK_0001fdfa + _UNK_00020038;
    break;
  case 'j':
    *(char **)param_1 = pcVar5 + 2;
    puVar9 = &UNK_0001fd38 + _UNK_0002003c;
    goto code_r0x0001fe9a;
  case 'l':
    *(char **)param_1 = pcVar5 + 2;
    puVar9 = &UNK_0001fe9c + _UNK_00020040;
code_r0x0001fe9a:
    iVar2 = 1;
    break;
  case 'm':
    *(char **)param_1 = pcVar5 + 2;
    puVar9 = &UNK_0001feaa + _UNK_00020044;
    goto code_r0x0001fea8;
  case 'n':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 8;
    puVar9 = &UNK_0001ff26 + _UNK_00020050;
    break;
  case 'o':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0x11;
    puVar9 = &UNK_0001ff18 + _UNK_00020054;
    break;
  case 's':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 5;
    puVar9 = &UNK_0001fd24 + _UNK_00020030;
    break;
  case 't':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 0xe;
    puVar9 = &UNK_0001fe08 + _UNK_00020034;
    break;
  case 'w':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 7;
    puVar9 = &UNK_0001ff34 + _UNK_00020018;
    break;
  case 'x':
    *(char **)param_1 = pcVar5 + 2;
    puVar9 = &UNK_0001fd2e + _UNK_00020048;
code_r0x0001fea8:
    iVar2 = 2;
    break;
  case 'y':
    *(char **)param_1 = pcVar5 + 2;
    iVar2 = 3;
    puVar9 = &UNK_0001fdec + _UNK_0002004c;
  }
  FUN_0001c5c0(&iStack_20,param_1,1);
  if (((local_1c == 0) || (pcVar5 = *(char **)param_1, pcVar5 == *(char **)((int)param_1 + 4))) ||
     (*pcVar5 != 'E')) {
    piVar4 = (int *)0x0;
  }
  else {
    *(char **)param_1 = pcVar5 + 1;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x33,0x18);
    *(undefined1 *)(piVar4 + 1) = 0x4d;
    iVar3 = _UNK_0002090c;
    piVar4[2] = (int)puVar9;
    piVar4[3] = iVar2;
    *piVar4 = (int)(&UNK_000208f0 + iVar3);
    piVar4[4] = iStack_20;
    piVar4[5] = local_1c;
    *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
  }
  return piVar4;
}


