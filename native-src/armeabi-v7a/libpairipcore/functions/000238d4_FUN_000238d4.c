/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000238d4
 * Address  : 000238d4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_000238d4(int param_1,int param_2,undefined4 *param_3)

{
  int iVar1;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  int *piVar5;
  undefined4 uVar6;
  int *piVar7;
  bool bVar8;
  
  iVar1 = *(int *)(param_1 + 8);
  if ((*(char *)(iVar1 + 4) == '\b') &&
     (iVar1 = FUN_0001d2ce(*(undefined4 *)(iVar1 + 8),*(undefined4 *)(iVar1 + 0xc),
                           DAT_00023a48 + 0x238f6,4), iVar1 != 0)) {
    uVar6 = *(undefined4 *)(param_2 + 4);
    FUN_0001bdc8(param_2,0x22);
    piVar5 = (int *)*param_3;
    piVar7 = piVar5 + param_3[1];
    bVar8 = false;
    for (; piVar5 != piVar7; piVar5 = piVar5 + 1) {
      iVar1 = *piVar5;
      if (*(char *)(iVar1 + 4) != 'M') {
LAB_00023a2e:
        *(undefined4 *)(param_2 + 4) = uVar6;
        goto LAB_00023a32;
      }
      pbVar2 = *(byte **)(iVar1 + 0x10);
      uVar4 = 0;
      for (iVar1 = *(int *)(iVar1 + 0x14); iVar1 != 0; iVar1 = iVar1 + -1) {
        uVar3 = (uint)*pbVar2;
        if (((uVar3 < 0x30) || (0x39 < uVar3)) || (0x19 < (int)uVar4)) goto LAB_00023a2e;
        pbVar2 = pbVar2 + 1;
        uVar4 = (uVar3 + uVar4 * 10) - 0x30;
      }
      if (0xff < (int)uVar4) goto LAB_00023a2e;
      if (bVar8) {
        uVar3 = uVar4 - 0x30;
        bVar8 = 9 < uVar3;
        if (bVar8) {
          uVar3 = uVar4 - 0x61;
        }
        if ((!bVar8 || uVar3 < 6) || (uVar4 - 0x41 < 6)) {
          FUN_0001dcd6(param_2,DAT_00023a4c + 0x23976,2);
        }
      }
      switch(uVar4) {
      case 7:
        iVar1 = DAT_00023a54 + 0x23990;
        break;
      case 8:
        iVar1 = DAT_00023a58 + 0x239c6;
        break;
      case 9:
        iVar1 = DAT_00023a68 + 0x239aa;
        break;
      case 10:
        iVar1 = DAT_00023a60 + 0x239b6;
        break;
      case 0xb:
        iVar1 = DAT_00023a6c + 0x239a4;
        break;
      case 0xc:
        iVar1 = DAT_00023a5c + 0x239cc;
        break;
      case 0xd:
        iVar1 = DAT_00023a64 + 0x239d2;
        break;
      default:
        if (uVar4 == 0x22) {
          iVar1 = DAT_00023a70 + 0x239b0;
          break;
        }
        if (uVar4 == 0x5c) {
          iVar1 = DAT_00023a50 + 0x2399e;
          break;
        }
        if ((0x1f < (int)uVar4) && (uVar4 != 0x7f)) {
          FUN_0001bdc8(param_2,uVar4);
          goto LAB_000239d8;
        }
        FUN_0001bdc8(param_2,0x5c);
        iVar1 = DAT_00023a74 + 0x239f6;
        if ((7 < (int)uVar4) && (FUN_0001bdc8(param_2,0x78), 0xf < uVar4)) {
          FUN_0001bdc8(param_2,*(undefined1 *)(iVar1 + (uVar4 >> 4)));
        }
        FUN_0001bdc8(param_2,*(undefined1 *)(iVar1 + (uVar4 & 0xf)));
        bVar8 = true;
        goto LAB_000239da;
      }
      FUN_0001dcd6(param_2,iVar1,2);
LAB_000239d8:
      bVar8 = false;
LAB_000239da:
    }
    FUN_0001bdc8(param_2,0x22);
    uVar6 = 1;
  }
  else {
LAB_00023a32:
    uVar6 = 0;
  }
  return uVar6;
}


