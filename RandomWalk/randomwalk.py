import matplotlib.pyplot as pypl
from pathlib import Path
import random

class Particle:
    def __init__(self):
        self.x = 0
        self.y = 0
        self.minValue = -10
        self.maxValue = 10
    
    def move(self):
        self.x += random.randint(-1, 1)
        self.y += random.randint(-1, 1)

        if self.x < self.minValue:
            self.x = self.minValue
        elif self.x > self.maxValue:
            self.x = self.maxValue
        
        if self.y < self.minValue:
            self.y = self.minValue
        elif self.y > self.maxValue:
            self.y = self.maxValue
    
    def get_position(self):
        return self.x, self.y

class Simulation:
    def __init__(self, numSteps):
        self.particle = Particle()
        self.numSteps = numSteps
        self.path = [(0, 0)]

    def run_step(self):
        self.particle.move()
        self.path.append(self.particle.get_position())

    def run(self):
        for _ in range(self.numSteps):
            self.run_step()
    
    def get_path(self):
        return self.path

class Plotter:
    def plot_walk(path):
        xValues: list = []
        yValues: list = []

        for x, y in path:
            xValues.append(x)
            yValues.append(y)
        
        pypl.figure(figsize=(8, 8))
        pypl.plot(xValues, yValues)
        pypl.scatter(xValues[0], yValues[0], marker="o", label="Start")
        pypl.scatter(xValues[-1], yValues[-1], marker="x", label="End")
        pypl.xlim(-10, 10)
        pypl.ylim(-10, 10)
        pypl.title("Random Walk - Single Particle")
        pypl.legend()
    
    def save_figure(mapNumber: int=1):
        outputDirectory: Path = Path("figures")
        outputDirectory.mkdir(exist_ok=True)
        filename: str = outputDirectory / f"figure_{mapNumber}.png"

        pypl.savefig(filename, dpi=300, bbox_inches="tight")
        pypl.close()

def main() -> None:
    simulation = Simulation(30)
    mapsGenerated: int = 0

    while mapsGenerated < 10:
        simulation.run()

        Plotter.plot_walk(simulation.get_path())
        Plotter.save_figure(mapsGenerated+1)

        mapsGenerated += 1

main()
