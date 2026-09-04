/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002d2f0
 * Address  : 0002d2f0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002d2f0(int *param_1,int *param_2,uint param_3)

{
  uint uVar1;
  int *piVar2;
  int *piVar3;
  int *piVar4;
  uint uVar5;
  int *piVar6;
  int *piVar7;
  int iVar8;
  int *piVar9;
  uint uVar10;
  
  iVar8 = param_2[1];
  piVar3 = (int *)0x0;
  piVar7 = (int *)0x0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if ((char)iVar8 == '\x01') {
    iVar8 = *param_2;
    piVar3 = (int *)FUN_000a0370(8);
    piVar7 = piVar3 + 2;
    *piVar3 = iVar8;
    *param_1 = (int)piVar3;
    param_1[1] = (int)piVar7;
    param_1[2] = (int)piVar7;
    piVar3[1] = iVar8 >> 0x1f;
  }
  piVar9 = (int *)param_2[2];
  piVar4 = (int *)param_2[3];
  do {
    if (piVar9 == piVar4) {
      return;
    }
    while( true ) {
      uVar1 = (int)piVar7 - (int)piVar3 >> 3;
      if (param_3 <= uVar1) {
        return;
      }
      iVar8 = *piVar9;
      if (piVar7 < (int *)param_1[2]) break;
      uVar5 = uVar1 + 1;
      if (0x1fffffff < uVar5) {
        FUN_0002d46c();
LAB_0002d468:
                    /* WARNING: Subroutine does not return */
        FUN_00026984();
      }
      uVar10 = param_1[2] - (int)piVar3;
      if (uVar5 < (uint)((int)uVar10 >> 2)) {
        uVar5 = (int)uVar10 >> 2;
      }
      if (0x7ffffff7 < uVar10) {
        uVar5 = 0x1fffffff;
      }
      if (uVar5 == 0) {
        piVar2 = (int *)0x0;
      }
      else {
        if (0x1fffffff < uVar5) goto LAB_0002d468;
        piVar2 = (int *)FUN_000a0370(uVar5 << 3);
      }
      piVar6 = piVar2 + uVar1 * 2;
      *piVar6 = iVar8;
      piVar6[1] = iVar8 >> 0x1f;
      __aeabi_memcpy(piVar2,piVar3,(int)piVar7 - (int)piVar3);
      piVar7 = piVar6 + 2;
      *param_1 = (int)piVar2;
      param_1[1] = (int)piVar7;
      param_1[2] = (int)(piVar2 + uVar5 * 2);
      if (piVar3 != (int *)0x0) {
        FUN_00023f68(piVar3,uVar10);
      }
      piVar9 = piVar9 + 1;
      param_1[1] = (int)piVar7;
      piVar3 = piVar2;
      if (piVar9 == piVar4) {
        return;
      }
    }
    *piVar7 = iVar8;
    piVar7[1] = iVar8 >> 0x1f;
    piVar7 = piVar7 + 2;
    piVar9 = piVar9 + 1;
    param_1[1] = (int)piVar7;
  } while( true );
}


