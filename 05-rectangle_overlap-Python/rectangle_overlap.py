# rectanglesOverlap(left1, top1, width1, height1, left2, top2, width2, height2)
# A rectangle can be described by its left, top, width, and height. This function
# takes two rectangles described this way, and returns True if the rectangles
# overlap at all (even if just at a point), and False otherwise.
# Note: here we will represent coordinates the way they are usually represented in
# computer graphics, where (0,0) is at the left-top corner of the screen, and while
# the x-coordinate goes up while you head right, the y-coordinate goes up while you
# head down (so we say that "up is down")


def fun_rectangle_overlap(left1, top1, width1, height1, left2, top2, width2, height2):
    if (left1 <= left2 and left2 <= (left1+width1)) or (left2 <= left1 and left1 <= (left2+width2)) or (top1 <= top2 and top2 <= (top1+height1)) or (top2 <= top1 and top1 <= (top2+height2)):
        return True
    else:
        return False
