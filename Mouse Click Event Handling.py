from pynput import mouse

def on_click(x, y, button, pressed):
    if pressed:
        print(f"Mouse clicked at ({x}, {y}) with {button}")

listener = mouse.Listener(on_click=on_click)
listener.start()

input("Press Enter to stop listening...\n")  # Keeps the program running
