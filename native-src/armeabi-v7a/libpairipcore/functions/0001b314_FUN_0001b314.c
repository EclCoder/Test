/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b314
 * Address  : 0001b314
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b314(void)

{
  int *piVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  undefined4 uVar5;
  int iVar6;
  longlong lVar7;
  int *local_1c;
  
  piVar1 = (int *)FUN_0001b414();
  if ((piVar1 == (int *)0x0) || (iVar4 = *piVar1, iVar4 == 0)) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b3d0 + 0x1b32e);
  }
  iVar2 = FUN_00023fb0(iVar4 + 0x28);
  if (iVar2 == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b3d8 + 0x1b3a8,*(undefined4 *)(DAT_0001b3d4 + 0x1b3a2));
  }
  lVar7 = FUN_00023fa6(iVar4 + 0x28);
  if (lVar7 == CONCAT44(DAT_0001b3bc,DAT_0001b3c0)) {
    local_1c = *(int **)(iVar4 + 4);
  }
  else {
    local_1c = (int *)(iVar4 + 0x80);
  }
  iVar2 = *(int *)(iVar4 + 8);
  iVar6 = *(int *)(iVar2 + 4);
  iVar4 = FUN_0001bb0c(iVar6,0,0,0);
  iVar2 = (**(code **)(**(int **)(DAT_0001b3c4 + 0x1b36e) + 0x10))
                    (*(int **)(DAT_0001b3c4 + 0x1b36e),iVar2,&local_1c);
  if (iVar4 == 0) {
    iVar4 = iVar6;
  }
  if (iVar2 == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b3cc + 0x1b3b8,*(undefined4 *)(DAT_0001b3c8 + 0x1b3b2),iVar4);
  }
  uVar5 = *(undefined4 *)(DAT_0001b3dc + 0x1b386);
  uVar3 = (**(code **)(*local_1c + 8))();
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001b3e0 + 0x1b39a,uVar5,iVar4,uVar3);
}


