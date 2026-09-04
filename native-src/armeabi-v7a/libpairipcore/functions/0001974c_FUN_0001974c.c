/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001974c
 * Address  : 0001974c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_0001974c(uint param_1)

{
  int iVar1;
  int *piVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  int unaff_r5;
  uint uVar8;
  uint uVar9;
  int iVar10;
  bool bVar11;
  uint local_28;
  
  iVar1 = DAT_00019774 + 0x19760;
  local_28 = param_1;
  if (param_1 < 0xd4) {
    piVar2 = (int *)FUN_00019d2a(iVar1,DAT_00019774 + 0x19820,&local_28);
    iVar7 = *piVar2;
LAB_0001976c:
    return CONCAT44(unaff_r5,iVar7);
  }
  FUN_00019d38(param_1);
  iVar3 = FUN_00026070(param_1,0xd2);
  unaff_r5 = DAT_000197b0 + 0x1979a;
  iVar7 = FUN_00019d2a(unaff_r5,DAT_000197b0 + 0x1985a,&stack0xffffffd4);
  iVar10 = iVar7 - unaff_r5 >> 2;
  do {
    iVar7 = *(int *)(unaff_r5 + iVar10 * 4) + iVar3 * 0xd2;
    uVar9 = 5;
    do {
      uVar5 = uVar9;
      if (uVar5 == 0x2f) goto LAB_000197e0;
      uVar8 = *(uint *)(iVar1 + uVar5 * 4);
      uVar4 = FUN_00026070(iVar7,uVar8);
      if (uVar4 < uVar8) goto LAB_0001976c;
      uVar9 = uVar5 + 1;
    } while (iVar7 != uVar8 * uVar4);
    if (0x2e < uVar5) {
LAB_000197e0:
      uVar9 = 0x1a3;
      do {
        uVar4 = uVar9 - 0xd0;
        uVar5 = FUN_00026070(iVar7,uVar4);
        if (uVar5 < uVar4) goto LAB_0001976c;
        if (iVar7 == uVar4 * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xc6);
        if (uVar5 < uVar9 - 0xc6) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xc6) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xc4);
        if (uVar5 < uVar9 - 0xc4) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xc4) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xc0);
        if (uVar5 < uVar9 - 0xc0) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xc0) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xbe);
        if (uVar5 < uVar9 - 0xbe) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xbe) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xba);
        if (uVar5 < uVar9 - 0xba) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xba) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xb4);
        if (uVar5 < uVar9 - 0xb4) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xb4) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xb2);
        if (uVar5 < uVar9 - 0xb2) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xb2) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xac);
        if (uVar5 < uVar9 - 0xac) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xac) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xa8);
        if (uVar5 < uVar9 - 0xa8) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xa8) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xa6);
        if (uVar5 < uVar9 - 0xa6) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xa6) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xa2);
        if (uVar5 < uVar9 - 0xa2) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xa2) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x9c);
        if (uVar5 < uVar9 - 0x9c) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x9c) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x96);
        if (uVar5 < uVar9 - 0x96) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x96) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x94);
        if (uVar5 < uVar9 - 0x94) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x94) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x8e);
        if (uVar5 < uVar9 - 0x8e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x8e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x8a);
        if (uVar5 < uVar9 - 0x8a) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x8a) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x88);
        if (uVar5 < uVar9 - 0x88) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x88) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x82);
        if (uVar5 < uVar9 - 0x82) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x82) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x7e);
        if (uVar5 < uVar9 - 0x7e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x7e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x78);
        if (uVar5 < uVar9 - 0x78) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x78) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x70);
        if (uVar5 < uVar9 - 0x70) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x70) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x6c);
        if (uVar5 < uVar9 - 0x6c) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x6c) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x6a);
        if (uVar5 < uVar9 - 0x6a) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x6a) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x66);
        if (uVar5 < uVar9 - 0x66) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x66) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 100);
        if (uVar5 < uVar9 - 100) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 100) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x60);
        if (uVar5 < uVar9 - 0x60) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x60) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x58);
        if (uVar5 < uVar9 - 0x58) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x58) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x52);
        if (uVar5 < uVar9 - 0x52) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x52) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x4e);
        if (uVar5 < uVar9 - 0x4e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x4e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x48);
        if (uVar5 < uVar9 - 0x48) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x48) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x46);
        if (uVar5 < uVar9 - 0x46) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x46) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x42);
        if (uVar5 < uVar9 - 0x42) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x42) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x3c);
        if (uVar5 < uVar9 - 0x3c) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x3c) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x3a);
        if (uVar5 < uVar9 - 0x3a) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x3a) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x34);
        if (uVar5 < uVar9 - 0x34) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x34) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x2e);
        if (uVar5 < uVar9 - 0x2e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x2e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x2a);
        if (uVar5 < uVar9 - 0x2a) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x2a) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x28);
        if (uVar5 < uVar9 - 0x28) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x28) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x24);
        if (uVar5 < uVar9 - 0x24) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x24) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x1e);
        if (uVar5 < uVar9 - 0x1e) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x1e) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x1c);
        if (uVar5 < uVar9 - 0x1c) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x1c) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x16);
        if (uVar5 < uVar9 - 0x16) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x16) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x12);
        if (uVar5 < uVar9 - 0x12) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x12) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0x10);
        if (uVar5 < uVar9 - 0x10) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0x10) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 0xc);
        if (uVar5 < uVar9 - 0xc) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 0xc) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9 - 10);
        if (uVar5 < uVar9 - 10) goto LAB_0001976c;
        if (iVar7 == (uVar9 - 10) * uVar5) break;
        uVar5 = FUN_00026070(iVar7,uVar9);
        if (uVar5 < uVar9) goto LAB_0001976c;
        iVar6 = uVar5 * uVar9;
        uVar9 = uVar9 + 0xd2;
      } while (iVar7 != iVar6);
    }
    iVar7 = iVar10 + 1;
    bVar11 = iVar10 != 0x2f;
    iVar10 = 0;
    if (bVar11) {
      iVar10 = iVar7;
    }
    if (iVar7 == 0x30) {
      iVar3 = iVar3 + 1;
    }
  } while( true );
}


