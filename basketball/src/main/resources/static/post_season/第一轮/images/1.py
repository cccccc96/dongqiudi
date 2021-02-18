import cv2
im1 = cv2.imread('2.jpg')
im2 = cv2.resize(im1,(2000,537),)  # 为图片重新指定尺寸
cv2.imwrite('d.jpg',im2)